public class OopClassAndObject{
    private String fruitName
    private String fruitColor
    def setFruitName(String name){
        fruitName=name
    }
    def setFruitColor(String color){
        fruitColor=color;
    }
    def getFruitName(){
        println("Name of the fruit is $fruitName")
    }
    def getFruitColor(){
        println("Color of the fruit is $fruitColor")
    }


    public static void main(String[] args) {
        OopClassAndObject obj=new OopClassAndObject();
        obj.setFruitName("Mango")
        obj.setFruitColor("Orange")
        obj.getFruitName()
        obj.getFruitColor()


    }
}
