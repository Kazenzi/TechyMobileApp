class Employee(var name: String, val employeeId: Int, var salary: Double) {

    fun displayInfo() {
        println("Employee ID: $employeeId")
        println("Name: $name")
        println("Salary: $$salary")
    }

    fun applyBonus(bonusPercentage: Double) {
        val bonusAmount = (bonusPercentage / 100) * salary
        salary += bonusAmount
        println("Bonus applied! New salary: $$salary")
    }

    fun updateName(newName: String) {
        name = newName
        println("Name updated to: $name")
    }
}

// Example usage:
fun main() {
    // Create an Employee object
    val employee1 = Employee("John Doe", 12345, 50000.0)

    // Display initial information
    employee1.displayInfo()

    // Apply a bonus
    employee1.applyBonus(10.0)

    // Update the employee's name
    employee1.updateName("John Smith")

    // Display updated information
    employee1.displayInfo()
}
