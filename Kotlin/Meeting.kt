fun meeting(s: String): String {
   val changedName = s.split(';').map ({ changeString(it) })
    return changedName.sorted().joinToString(separator = "") { it.toUpperCase() }
}

fun changeString (s:String):String {
    val name =  s.split(':').reversed()
    return name.joinToString(prefix = "(",postfix = ")",separator = ", ") { it.toUpperCase() }
}
