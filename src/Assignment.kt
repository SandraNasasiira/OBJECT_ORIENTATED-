fun main() {
    var Resty=Human("Tatianah Miles",20,65.3)
    println(Resty.name)
    Resty.eat(56)
    println(Resty.weight)
    Resty.speak("Janet is big")
    Resty.birthday()
    var Sandra=User("Nasasiira","Resty","sandranasasiiraresty@gmail.com",7780987,"sandie")
    println(Sandra.firstName)
    println(Sandra.email)
}
class Human(var name: String,var age:Int,var weight: Double){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech:String){
        println("$speech")
    }
    fun birthday(){
        age+=1
        println(age)
    }
}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:String)