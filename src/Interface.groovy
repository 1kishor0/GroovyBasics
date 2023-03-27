interface Interface{
    def startEngine()
    def stopEngine()
}

class Toyotas implements Interface{

    @Override
    def startEngine() {
        println("Hey start Engine")
    }

    @Override
    def stopEngine() {
println("Hey Stop the Engine")
    }

    static void main(String[] args) {
        Toyotas obj1=new Toyotas()
        obj1.startEngine()
        obj1.stopEngine()
    }
}

