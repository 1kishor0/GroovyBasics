class List {
    static void main(String[] args) {
        def fruits=["Apple", "Orange","Grapes"]
        def fruits2=[]

        fruits2.add(2)
        fruits2.add(3)
        println(fruits)
        println(fruits2.get(1))
        println(fruits.contains("Apple"))
        //matching using interset
       println fruits2.intersect ([1,2,3,4])
//we can use remove,plus,minus,pop,removelast,sort,reverse,isempty function every of arraylist function
    }
}
