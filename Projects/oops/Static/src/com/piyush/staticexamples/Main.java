package com.piyush.staticexamples;

//we know something that is not static belongs to object of that class
//static is function of class , nnot obj;
//so thats why main is static method , so our system can call it without makeing any object.abstract 
//Also we can't call non static method without declaring obj
//like greeting() isn't static so we can't call it directly;
//we have to make a obj of class Main then we can call it.
//now that will work;
//you can call static in non static method;
// you can use nonstatic inside nonstatic method because at last they all will be called inside static 
//so they will need object at last;




public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        //Human rahul = new Human(12, 45, "Rahul");
        System.out.println(Human.population);

        //greeting() wont work
    
        Main a = new Main();
        a.greeting();
    
    }

    void greeting(){
        //main(new String[0]);
        System.out.println("hello world");
    }
}
