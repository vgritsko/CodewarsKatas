import java.math.BigDecimal
import java.math.BigDecimal.ROUND_HALF_UP


object RangeIntegersKataSolution {
    fun mysteryRange(s: String, n: Int): Pair<Int, Int> {
        val maxOrder: Int = s.length / n
        var range = mutableListOf<Int>()
        var min:Int = 0
        var max = 0
        if (maxOrder * n == s.length ) {
            range.addAll(s.chunked(2).map { it.toInt() })
            min = range.min()?:0
            max = range.max()?:0
        } else {

            val doubleNumQuantaty = s.length - n * maxOrder
            val singleNumQuantaty = s.length - (doubleNumQuantaty * (maxOrder + 1))

            min = Math.pow(10.toDouble(), maxOrder.toDouble())
                .toInt() - (singleNumQuantaty / maxOrder)
            max = min + n - 1
        }
        if (!isSequencesEquals(s, n, min)) {
            min = (110 - n * 3 + s.length) / 2
            max = min + n - 1
        }
        return Pair(min, max)
    }

    fun isSequencesEquals(s: String, n: Int, min: Int): Boolean {
        return (min until min + n).joinToString("").toCharArray().sorted() == s.toCharArray().sorted()
    }


    fun mysteryRange2(s: String, n: Int): Pair<Int, Int> {
        val l = s.length
        val p = l / n
        var start = if (p * n == l) {
            s.chunked(p).min()!!.toInt()
        } else {
            val a = n * p + n - l
            10.pow(p) - a
        }

        if (!check(s, n, start)) {
            start = (110 - n * 3 + l) / 2
        }

        return Pair(start, start + n - 1)
    }


    fun check(s: String, n: Int, start: Int): Boolean {
        return (start until start + n).joinToString("").toCharArray().sorted() == s.toCharArray()
            .sorted()
    }

    fun Int.pow(n: Int): Int {
        var pow = 1
        repeat(n) {
            pow *= this
        }
        return pow
    }
}


