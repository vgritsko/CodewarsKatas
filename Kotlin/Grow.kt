
fun grow(arr: IntArray): Int {
    return  arr.fold(1) { mul, it -> it * mul }
}
