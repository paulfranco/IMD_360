package co.paulfran.imd_360.models

data class Market(
    val marketName: String,
    var routes: MutableList<Route>
)
