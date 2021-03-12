package co.paulfran.data

import co.paulfran.imd_360.models.*

class AppData {

    companion object DataHolder {

        fun initialize() {
            val invoice1 = Invoice("dwedwwewe1213")
            val customer1 = Customer("Joe", "Smith", mutableListOf(invoice1))

            val invoice2 = Invoice("dwedwwsasewe121")
            val customer2 = Customer("Jill", "Franck", mutableListOf(invoice2))

            val invoice3 = Invoice("qdddwedwwewe3444")
            val customer3 = Customer("Bill", "Thomas", mutableListOf(invoice3))

            val invoice4 = Invoice("dwnbdt53705")
            val customer4 = Customer("Peter", "Acme", mutableListOf(invoice4))

            val invoice5 = Invoice("dwoytnge76342")
            val customer5 = Customer("May", "April", mutableListOf(invoice5))

            val stop1 = Stop("1", mutableListOf(customer1))
            val stop2 = Stop("2", mutableListOf(customer2))
            val stop3 = Stop("3", mutableListOf(customer3))
            val stop4 = Stop("4", mutableListOf(customer4))
            val stop5 = Stop("5", mutableListOf(customer5))

            val route1 = Route("1", "May 1, 2021", mutableListOf(stop1, stop2, stop3, stop4, stop5))

            val spokane =  Market("Spokane", mutableListOf(route1))

            val mor = Client("Mor Furniture", mutableListOf(spokane))
        }
    }
}