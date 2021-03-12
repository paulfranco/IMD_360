package co.paulfran.imd_360.models

data class Stop(
    val stopNumber: String,
    val invoices: MutableList<Invoice>
)
