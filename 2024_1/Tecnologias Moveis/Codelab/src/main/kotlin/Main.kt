fun main() {
   println(birthdayGreeting(age = 5))
    println(birthdayGreeting(age = 2))
}

fun birthdayGreeting(name: String = "Tiago", age: Int): String {
    //val nameGreeting = "Happy Birthday, $name!"
    //val ageGreeting = "You are now $age yers old!"
    //return "$nameGreeting\n$ageGreeting"
    return "Happy Birthdey, $name! You are now $age yers old!"
}