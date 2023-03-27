class Animal{
    String name
    //String breed
    def eats(){
        println("$name eats")
    }
    def moves(){
        println("$name moves" )
    }
}
class Dog extends Animal{
    String dogName
    def plays(){
        println "$dogName Loves to play"
    }
    def eats(){
        println("$dogName loves to eat!")
    }
}

class Inheritance {

    static void main(String[] args) {
        Animal obj0=new Animal()
        obj0.name="Dog"
        obj0.eats()
        obj0.moves()


        Dog obj1=new Dog()
        obj1.dogName="Humpy"
        obj1.plays()
        obj1.eats()

    }
}
