import kotlin.math.sqrt


fun buddy(start: Long, limit: Long): String {
    for (n in start..limit) {
        val sN = findSumDivisors(n)
        if (sN - 1 > n) {
            val sumSecondNumberDivisors = findSumDivisors(sN - 1)
            if (sumSecondNumberDivisors - 1 == n) {
                val m = sN - 1
                return "($n $m)"
            }
        }
    }
    return "Nothing"
}

fun findSumDivisors(num: Long): Long {
    var sum = 0L
    val root = sqrt(num.toDouble()).toLong()
    for (n in 1..root) {
        if (num % n == 0L) sum += n + num / n
    }
    if (num % root == 0L && num / root == root) sum -= root
    return sum - num
}
