fun repeats(arr: IntArray): Int = arr.toList()
    .groupingBy { it }
    .eachCount()
    .filter { it.value == 1 }
    .keys
    .sum()

