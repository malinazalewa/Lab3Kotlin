import java.util.*

fun bubbleSort(array: IntArray) {
    val size = array.size
    for (i in 0 until size - 1) for (j in 0 until size - i - 1) if (array[j] > array[j + 1]) {
        val temp = array[j]
        array[j] = array[j + 1]
        array[j + 1] = temp
    }
}

fun main(args: Array<String>) {
    val data = intArrayOf(-20, 459, -1000, 11, -9)
    bubbleSort(data)
    println("Posortowane:")
    println(Arrays.toString(data))
}
