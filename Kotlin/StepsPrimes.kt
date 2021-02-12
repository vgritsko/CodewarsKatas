fun step(g: Int, m: Long, n: Long): LongArray {
    for (i in m..n) {
        if (i+g>n) return longArrayOf()
        if (isPrime(i) && isPrime(i + g)) return longArrayOf(i, i + g)
    }
    return longArrayOf()
}

fun isPrime(num: Long): Boolean {
    if (num <= 1L) return false
    if (num == 2L) return true
    if (num % 2 == 0L) return false
    for (i in 3..Math.sqrt(num.toDouble()).toInt() step 2) {
        if (num % i == 0L) return false
    }
    return true
}
