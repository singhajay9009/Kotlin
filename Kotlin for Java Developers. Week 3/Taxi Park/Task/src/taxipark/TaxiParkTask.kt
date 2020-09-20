package taxipark

import java.lang.Math.pow

/*
 * Task #1. Find all the drivers who performed no trips.
 */
fun TaxiPark.findFakeDrivers(): Set<Driver> =
            allDrivers.filter{
                driver -> this.trips.none{
                trip ->  trip.driver.name == driver.name
            }
            }.toSet()
/*
 * Task #2. Find all the clients who completed at least the given number of trips.
 */
fun TaxiPark.findFaithfulPassengers(minTrips: Int): Set<Passenger> =
        this.allPassengers.filter{ 
            p -> this.trips.count{
            trip -> trip.passengers.contains(p)
        }>= minTrips
        }.toSet()

/*
 * Task #3. Find all the passengers, who were taken by a given driver more than once.
 */
fun TaxiPark.findFrequentPassengers(driver: Driver): Set<Passenger> =
        this.allPassengers.filter{
            p ->
             this.trips.filter{ trip ->
                 trip.driver.name == driver.name && trip.passengers.contains(p)
        }.size> 1
        }.toSet()

/*
 * Task #4. Find the passengers who had a discount for majority of their trips.
 */
fun TaxiPark.findSmartPassengers(): Set<Passenger> =
        this.allPassengers.filter { p ->
                val (discounted, nonDiscounted) = this.trips.filter { trip ->
                    trip.passengers.contains(p)
                }.partition { trip2 -> trip2.discount!= null }
                discounted.size > nonDiscounted.size
        }.toSet()

/*
 * Task #5. Find the most frequent trip duration among minute periods 0..9, 10..19, 20..29, and so on.
 * Return any period if many are the most frequent, return `null` if there're no trips.
 */
fun TaxiPark.findTheMostFrequentTripDurationPeriod(): IntRange? {
    var mapDuration: MutableMap<Int, Int>?  = null
    var rangeIdentity: Int =0;
    this.trips.forEach {
        trip ->
            val timeDuration: Int = trip.duration
            rangeIdentity = timeDuration/10
            if(mapDuration != null){
                if(mapDuration!!.containsKey(rangeIdentity)){
                    mapDuration!![rangeIdentity]?.plus(1)?.let { mapDuration!!.put(rangeIdentity, it) }
                }
                else{
                    mapDuration!!.put(rangeIdentity, 1)
                }
            }else{
                mapDuration = mutableMapOf(rangeIdentity to 1)
            }
    }
    var maxVal = 0;
    var index = 0;
    mapDuration?.forEach{
       (k, v) ->
        if(v > maxVal) {
            index = k
            maxVal = v
        }
    }
    var rangeStart = index*10
    var rangeEnd = rangeStart+9
    var rangeVal:IntRange? = rangeStart..rangeEnd

    return if(mapDuration != null) rangeVal else null


}

/*
 * Task #6.
 * Check whether 20% of the drivers contribute 80% of the income.
 */
fun TaxiPark.checkParetoPrinciple(): Boolean {

    if (this.trips.isEmpty()) return false
    else{
        val sizeDriver = this.allDrivers.size

        val map:Map<Driver, List<Double>> =  this.trips.groupBy({it.driver}, {it.cost})

        val mapDriverTosumOfCost: MutableMap<Driver, Double> = mutableMapOf()

        map.forEach{
            (k, v) ->
            mapDriverTosumOfCost[k] = v.sum()
        }

        val listOfPairs:List<Pair<Driver, Double>> = mapDriverTosumOfCost.toList().sortedBy { it.second }.reversed()

        val twentyPercentOfDrivers = (sizeDriver * 0.2).toInt()
        var counter =1
        var costOfTopTwentyTrips = 0.0
        var totalTripsCost = 0.0
        listOfPairs.forEach {
            if(counter<=twentyPercentOfDrivers){
                costOfTopTwentyTrips += it.second
                counter += 1
            }
           totalTripsCost += it.second
        }
        return costOfTopTwentyTrips >= totalTripsCost * 0.8
    }

}