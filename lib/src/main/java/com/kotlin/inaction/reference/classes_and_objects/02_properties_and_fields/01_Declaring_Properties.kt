package com.kotlin.inaction.reference.classes_and_objects.`02_properties_and_fields`

class Address {
    var name: String = "wzc"
    var street: String = "High Tech New District"
    var city: String = "Zhengzhou"
    var state: String? = null
    var zip: String = "123456"
}

fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    result.city = address.city
    result.state = address.state
    result.zip = address.zip
    return result
}