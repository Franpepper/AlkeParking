data class Parking(val vehicles: MutableSet<Vehicle>): Parkable(vehicles) {

    private val maxParkingSpace: Int = 20;
    private val parkingData : Pair<Int, Int> = Pair(earnings, totalCheckOuts)

    fun addVehicle(vehicle: Vehicle): String {
        return when (maxParkingSpace - vehicles.size) {
            in 1..maxParkingSpace -> {
                vehicles.add(vehicle)
                "Welcome to AlkeParking"
            }
            else -> "Sorry, the check-in failed"
        }
    }

    fun listVehicles(){
        println("Vehicles in the parking:")
        vehicles.forEach {vehicle -> println(vehicle.plate)}
            //println(it.plate) }
    }

    fun showParkingData(){
        println("Total earnings: $parkingData(first)")
        println("Total check-outs: ${parkingData.second}")
    }
}