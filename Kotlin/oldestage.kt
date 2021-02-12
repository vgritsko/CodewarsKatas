import kotlin.math.absoluteValue

fun twoOldestAges(ages: List<Int>): List<Int> {

    return ages.sorted().takeLast(2)
}

fun sumParts(ls: IntArray): IntArray {
    if (ls.count() > 1) {
        val sums = ArrayList<Int>()
        var maxSum = ls.sum()
        sums.add(maxSum)
        val newLs = ls.toMutableList()
        for (i in 0..ls.size - 1) {
            maxSum -= ls.get(i)
            sums.add(maxSum)
        }
        return sums.toIntArray()
    } else return intArrayOf(0)

}
