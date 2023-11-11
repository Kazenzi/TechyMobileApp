fun findMax(listOfNumber: List<Int>): Int {
    // Initialize the maximum value
    var maxValue = listOfNumber[0]

    // Iterate over the list of numbers and compare each element to the current maximum value
    for (number in listOfNumber) {
        if (number > maxValue) {
            maxValue = number
        }
    }

    // Return the maximum value
    return maxValue
}

fun main() {
    var numbers = listOf(30, 21, 41, 5, 56, 12, 15, 78)
    var maxNum = findMax(numbers)
    print(maxNum)
}