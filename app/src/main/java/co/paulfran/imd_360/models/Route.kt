package co.paulfran.imd_360.models

data class Route(
    val title: String,
    val date: String,
    var stops: MutableList<Stop>
)
