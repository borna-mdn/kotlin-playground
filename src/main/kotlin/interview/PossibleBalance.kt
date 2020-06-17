package interview

fun possibleBalance(str: String, balance: Int): Int {
    var currentBalance = 0
    str.forEach {
        when (it) {
            '+' -> currentBalance++
            '-' -> currentBalance--
        }
    }
    if (currentBalance >= balance) return 0
    str.reversed().forEachIndexed { index, c ->
        when (c) {
            '+' -> currentBalance--
            '-' -> currentBalance++
        }
        if (currentBalance >= balance) return index + 1
    }
    return -1
}