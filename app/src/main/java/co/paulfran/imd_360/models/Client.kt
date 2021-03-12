package co.paulfran.imd_360.models

data class Client(
    val clientName: String,
    var markets: MutableList<Client>
)
