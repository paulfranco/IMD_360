package co.paulfran.imd_360.models

data class Invoice(
    val invoiceNumber: String,
    var customer: Customer
)
