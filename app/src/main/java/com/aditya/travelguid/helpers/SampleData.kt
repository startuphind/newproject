package com.aditya.travelguid.helpers

import com.aditya.travelguid.models.Destination
import java.util.*

object SampleData {

	val DESTINATIONS = ArrayList<Destination>()

	private var COUNT = 5

	private var dummy_description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce accumsan quis justo quis hendrerit. Curabitur a ante neque. Fusce nec mauris sodales, auctor sem at, luctus eros. Praesent aliquam nibh neque. Duis ut suscipit justo, id consectetur orci. Curabitur ultricies nunc eu enim dignissim, sed laoreet odio blandit."

	init {
		// Add some sample items
		val newDestination1 = Destination()
		newDestination1.id = 1
		newDestination1.city = "New Delhi"
		newDestination1.description = dummy_description
		newDestination1.country = "India"
		DESTINATIONS.add(newDestination1)

		val newDestination2 = Destination()
		newDestination2.id = 2
		newDestination2.city = "Gorakhpur"
		newDestination2.description = dummy_description
		newDestination2.country = "India"
		DESTINATIONS.add(newDestination2)

		val newDestination3 = Destination()
		newDestination3.id = 3
		newDestination3.city = "Bhopal"
		newDestination3.description = dummy_description
		newDestination3.country = "India"
		DESTINATIONS.add(newDestination3)

		val newDestination4 = Destination()
		newDestination4.id = 4
		newDestination4.city = "Lucknow"
		newDestination4.description = dummy_description
		newDestination4.country = "India"
		DESTINATIONS.add(newDestination4)

		val newDestination5 = Destination()
		newDestination5.id = 5
		newDestination5.city = "Jhashi"
		newDestination5.description = dummy_description
		newDestination5.country = "India"
		DESTINATIONS.add(newDestination5)

		val newDestination6 = Destination()
		newDestination2.id = 6
		newDestination2.city = "Kolkata"
		newDestination2.description = dummy_description
		newDestination2.country = "India"
		DESTINATIONS.add(newDestination6)

		val newDestination7 = Destination()
		newDestination2.id = 7
		newDestination2.city = "Patna"
		newDestination2.description = dummy_description
		newDestination2.country = "India"
		DESTINATIONS.add(newDestination7)


		val newDestination8 = Destination()
		newDestination2.id = 8
		newDestination2.city = "Mumbai"
		newDestination2.description = dummy_description
		newDestination2.country = "India"
		DESTINATIONS.add(newDestination8)

		val newDestination9 = Destination()
		newDestination2.id = 9
		newDestination2.city = "Dhanbad"
		newDestination2.description = dummy_description
		newDestination2.country = "India"
		DESTINATIONS.add(newDestination9)

		val newDestination10 = Destination()
		newDestination2.id = 10
		newDestination2.city = "Noida"
		newDestination2.description = dummy_description
		newDestination2.country = "India"
		DESTINATIONS.add(newDestination10)

	}

	fun addDestination(item: Destination) {
		item.id = COUNT
		DESTINATIONS.add(item)
		COUNT += 1
	}

	fun getDestinationById(id: Int): Destination? {
		for (i in DESTINATIONS.indices) {
			if (DESTINATIONS[i].id == id) {
				return DESTINATIONS[i]
			}
		}

		return null
	}

	fun deleteDestination(id: Int) {
		var destinationToRemove: Destination? = null

		for (i in DESTINATIONS.indices) {
			if (DESTINATIONS[i].id == id) {
				destinationToRemove = DESTINATIONS[i]
			}
		}

		if (destinationToRemove != null) {
			DESTINATIONS.remove(destinationToRemove)
		}
	}

	fun updateDestination(destination: Destination) {
		for (i in DESTINATIONS.indices) {
			if (DESTINATIONS[i].id == destination.id) {
				val destinationToUpdate = DESTINATIONS[i]

				destinationToUpdate.city = destination.city
				destinationToUpdate.description = destination.description
				destinationToUpdate.country = destination.country
			}
		}
	}
}
