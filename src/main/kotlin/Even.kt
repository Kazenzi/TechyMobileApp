fun main() {
    val numbers = mutableListOf(2, 16, 3, 4, 11, 1, 3, 6, 7, 5, 13)

    println("Even numbers in the list:")

    for (number in numbers) {
        if (number % 2 == 0) {
            println(number)
        }
    }
}
