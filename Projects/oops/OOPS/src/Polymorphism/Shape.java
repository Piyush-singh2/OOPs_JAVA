package Polymorphism;



//if we put a class as final , we can't inherit it and implicitly  its all method are final too.

public  class Shape {



    //by  using final keyword we can't use override method.
    //Its called early binding and makes the program fast as at run time complier not have to decide which method to run but it actually know.

    // final void area(){
    //     System.out.println("I am in shapes");
    // }




    static void greeting(){
        System.out.println("i am in box greeting");
    }

     void area(){
        System.out.println("I am in shapes");
    }
}
