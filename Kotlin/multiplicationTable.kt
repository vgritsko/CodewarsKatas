object KataSolution {
    fun multiplicationTable(size: Int): Array<IntArray> {
        val table = ArrayList<IntArray>()
        for (i in 1..size) {
           val row = IntArray(size,{j->j+i})
            table.add(row)
        }
        return table.toTypedArray()
    }
}
