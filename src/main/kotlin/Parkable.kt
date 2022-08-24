import java.lang.Math.ceil
import java.util.*

open class Parkable(private val vehicle: MutableSet<Vehicle>) {
    var earnings: Int = 0
    var totalCheckOuts: Int = 0
    fun checkOutVehicle(plate: String): String {

        val isVehicleParked = vehicle.filter {
            it.plate == plate.uppercase(Locale.getDefault()).replace(" ", "")
        }
        if (isVehicleParked.isNotEmpty()){
            val vehicleToCheckOut = isVehicleParked[0]
            var parkingFee = calculateFee(vehicleToCheckOut.vehicleType, vehicleToCheckOut.parkedTime.toDouble())
            if(vehicleToCheckOut.discountCard != null) {
                parkingFee -= (parkingFee * 0.15).toInt()
            }
            vehicle.remove(vehicleToCheckOut)
            totalCheckOuts++
            earnings += parkingFee
            return onSuccess(parkingFee)
        }
        return onError()
    }

    private fun calculateFee(type: VehicleType, parkedTime: Double): Int{
        val fee: Int
        return when{
            parkedTime <= 120 -> type.price
            else -> {
                    fee = ceil((((parkedTime - 120)/15))).toInt() * 5
                    type.price + fee
                }
            }

        }
    }

    private fun onSuccess(parkingFee: Int): String {
        return "Your parking fee is $parkingFee. Come back soon!"
    }

    private fun onError(): String {
        return "Sorry, the check-out failed"
    }

