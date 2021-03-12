package co.paulfran.imd_360.models

data class Customer(
    val firstName: String,
    val lastName: String,
    var invoices: MutableList<Invoice>
)
