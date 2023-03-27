class OopClass2 {
    String Name;
    short age;
    short birthYear;
    short salary1;
    short salary2;

    def details(String s,short a1,short b1,short s1,short s2){
        Name=s
        age=a1
        birthYear=b1;
        salary1=s1;
        salary2=s2;

    }
    def printDetails(){
        println "My name is $name and my age is $age. My birthYear was $birthYear, Two months ago my salary was $salary1. Now current my salary is $salary2. Total salary in two months : "+(salary1+salary2)
    }

    static void main(String[] args) {
        OopClass2 obj=new OopClass2()
        String s="sakib"
        byte a1=24
        short b1=1999
        short s1=30000
        short s2=35000
        obj.details(s,a1,b1,s1,s2)
        obj.printDetails();

    }
}
