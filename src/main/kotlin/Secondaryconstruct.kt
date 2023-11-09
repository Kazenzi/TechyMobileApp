fun main() {
    var christiana = Person("Christiana", 100)
    christiana.walk()
    var tomi = Person("Tomilayo")
    tomi.walk()
    var anon = Person()
    anon.walk()
}
//kotlin we only use var
class Person{
    var age: Int
    var name: String

    constructor(pName: String, pAge: Int){
        age = pAge
        name = pName
    }

    constructor(pName: String){
        name = pName
        age = 0
    }

    constructor(){
        name ="Anonymous"
        age = 0
    }

    fun walk(){
        println("$name is walking")
    }

    fun goShopping(items: MutableList<String>){
        println("I am shopping for $items")
    }
}