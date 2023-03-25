class Ranges {
    static void main(String[] args) {
         //2 types of ranges , inclusive(1..10) and exclusive(1..<10)
        def range =1..10
        println(range)
        println(range.size())
        println(range.getFrom())
        println(range.getTo())

        assert range.from==1
        assert  range.to==10

        println range.get(3)
        println(range.contains(7))
        println(range.reverse)

        def range2=range.subList(3,7)
        println(range2.getFrom())

        for (i in range){
            print(i+" ")
        }
        (1..10).each{i->
            print("value = $i"+" ")
        }
        println()
println(range instanceof java.util.List)
    }
}
