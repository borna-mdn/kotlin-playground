package interview

fun main() {
    print(getTurningNumber(intArrayOf(8, 6, 1, 7)))
}

fun getTurningNumber(array: IntArray): Int {
    val min = 0
    val max = array.size - 1
    return turningNumber(array, min, max)
}

fun turningNumber(array: IntArray, min: Int, max: Int): Int {
    val middle = (min + max) / 2
    val current = array[middle]
    val previous = array[middle - 1]
    val next = array[middle + 1]
    return if (current < previous && current < next) current
    else if (current < previous) turningNumber(array, middle, max)
    else if (current < next) turningNumber(array, min, middle)
    else throw IllegalStateException()
}
