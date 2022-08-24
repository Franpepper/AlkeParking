import java.util.*

fun main() {
    val car = Vehicle("AA111AA", VehicleType.CAR, Calendar.getInstance(),"DISCOUNT_CARD_001")
    val moto = Vehicle("B222BBB", VehicleType.MOTORBIKE, Calendar.getInstance())
    val minibus = Vehicle("C333CCC", VehicleType.MINIBUS, Calendar.getInstance())
    val bus = Vehicle("D444DDD", VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val parking = Parking(mutableSetOf(car, moto, minibus, bus))

    val listOfVehicles = listOf(
        Vehicle("AA222AA", VehicleType.MOTORBIKE, Calendar.getInstance()),
        Vehicle("BB222BB", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("CC333CC", VehicleType.MOTORBIKE, Calendar.getInstance()),
        Vehicle("DD444DD", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("EE555EE", VehicleType.MOTORBIKE, Calendar.getInstance()),
        Vehicle("FF666FF", VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_003"),
        Vehicle("GG777GG", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("HH888HH", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("II999II", VehicleType.MOTORBIKE, Calendar.getInstance(), "DISCOUNT_CARD_004"),
        Vehicle("JJ110JJ", VehicleType.MINIBUS, Calendar.getInstance()),
        Vehicle("KK111KK", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("LL222LL", VehicleType.MOTORBIKE, Calendar.getInstance()),
        Vehicle("MM333MM", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("NN444NN", VehicleType.MOTORBIKE, Calendar.getInstance()),
        Vehicle("OO555OO", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("PP666PP", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_005"),
        Vehicle("QQ777QQ", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("RR888RR", VehicleType.MOTORBIKE, Calendar.getInstance()),
        Vehicle("SS999SS", VehicleType.MINIBUS, Calendar.getInstance(), "DISCOUNT_CARD_006"),
        Vehicle("TT110TT", VehicleType.CAR, Calendar.getInstance()),
    )


    listOfVehicles.map{vehicle -> println(parking.addVehicle(vehicle))
        //println(parking.addVehicle(it))
   }

    println(parking.checkOutVehicle("FF666FF"))
    println(parking.checkOutVehicle("AA222AA"))
    println(parking.checkOutVehicle("FF"))
    println(parking.checkOutVehicle(" bb 222 bb "))

    println(parking.listVehicles())
    println(parking.showParkingData())
}