abstract class Car{
    String name;
    String color;
    String model;

    def StartEngine(){
        println("Engine Started for $name")
    }
    abstract def topSpeed();
}
class Toyota extends Car{
    String topSpeedd;
    @Override
    def topSpeed() {
        println("Top Speed for $name is  $topSpeedd")
    }
}
class AbstractClass {
    static void main(String[] args) {
        Toyota obj1=new Toyota()
        obj1.name="Sakib"
        obj1.topSpeedd="50kmh"
        obj1.StartEngine()
        obj1.topSpeed()

    }
}
