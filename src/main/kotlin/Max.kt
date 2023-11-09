fun main() {
    val numbers = mutableListOf(2, 16, 3, 4, 11, 1, 3, 6, 7, 5, 13)

    var max = Int.MIN_VALUE
    var index = 0

    while (index < numbers.size) {
        if (numbers[index] > max) {
            max = numbers[index]
        }
        index++
    }

    println("The maximum element in the list is: $max")
}
