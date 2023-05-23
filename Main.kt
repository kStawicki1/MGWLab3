
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(2, 4, 5, 1, 2137, 9, 6)
        for (i in 0 until arr.size - 1) for (j in 0 until arr.size - i - 1) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
        printArray(arr)
    }

    fun printArray(array: IntArray) {
        for (i in array.indices) {
            println(array[i])
        }
    }
}
