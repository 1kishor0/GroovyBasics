class Basics {
    static void main(String[] args) {
//       def x=10;
//        def (a,b,c)=[10, 20, 30];
//        print b

//for in
        for(int i in 1..5){
            println i;
        }
1.upto(5)
        {
            println("$it")
        }

        5.times {println("$it")}

        1.step(10,3) {println("$it")}




       //Interative over map

        def map=["name":"Groovy","Subject":"Automation"]
        def f=0;
        for(e in map){
            f+=e.value
            println(e.key+":"+e.value)
        }
        println(f)


        //Exception Handling
        try{
            int i =1/0
        }catch (Exception e){
            println "I am  inside an exception block"
            println e.getCause()
            println e.getMessage()
           // println e.printStackTrace()
        }finally {
            println "I am inside finally block"
        }

println "Another set of code"


        //Strings in groovy
    def name="Sakib"
     println("My name is "+name)
     println("My name is ".concat(name))
     println("My name is $name") //interpolation
     def s1="""This is a groovy class 
and we are multiline code strings"""
        println(s1.length())
        println s1.indexOf('g')
        println s1 [0..3]
        println s1[5..3]
        println s1[0,2,4]

        println(s1.substring(2))
        println(s1.subSequence(1,4)  )

        def str="This is groovy class"
        println str.split(" ")
        println str -("groovy")
        println str.replace("class","session")
        println str.toLowerCase()
        println str.toUpperCase()
        println str.toList()
        println "groovy"*3
        println "Abc".equals("Abcx")
        println "Abc".equalsIgnoreCase("abc")



        def s3=/a green sky here, 
and it is okay  /
        def s4=$/a blue tree/$
        println(s3)
        println(s4)


        //Method

//def sum (int a =10,int b=20){
//    println(a+b)
//}
//        sum(1,2)

        //Closure
        def str2="Hey"
        def myClosure={name2 -> println "$str2 $name"}
        myClosure.call("Sakib")


        def myMethod=
        {
            l,g,c ->
            return l+g+c
        }

        def res=myMethod(10,2,34)

        def mList1=["Apples","Orange","Grapes"]
        println mList1.each {it}

        def maps=['Subject ': 'Groovy',
                'Topic' : 'Closure'

        ]
println maps.each {it}
        def MyList=[1,2,3,4,5]
        println MyList.find{item -> item==3}
        println MyList.findAll{item ->item >5}
        println MyList.any{item ->item >5}
        println MyList.every{item ->item >5}
    }
}
