// Fixed, domiciliary, savings, premier, current, student, joint
fun main() {
    var a = CurrentAccount("Rodiat")
    a.deposit(2500.0)
    a.withdraw(7500.50)
    a.printAccount()
}

class CurrentAccount(var fname: String): Account(fname){
    fun overdraft(){

    }

    override fun withdraw(amount: Double){
        var left = balance - amount
        if(left < 1000){
            println("Insufficient Balance")
        }else{
            balance -= amount
            println("$name has withdrawn $amount successfully")
        }
    }
}

open class Account(var name: String){
    protected var balance:Double = 0.0

    open fun withdraw(amount: Double){
        balance -= amount
        println("$amount has been withdrawn")
    }

    fun deposit(amount: Double){
        balance += amount
        println("$amount has been deposited")
    }

    fun printAccount(){
        println("$name balance is $balance")
    }
}