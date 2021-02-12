fun maxMultiple(d: Int, b: Int): Int {
    var maxDividend = 0
    (d..b).forEach { if (it % d == 0) maxDividend = it }
    return maxDividend
}
