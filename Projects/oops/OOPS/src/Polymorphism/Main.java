package Polymorphism;

//poly morphism means - many way to represent
//types of polymorphism










//Runtime/Overriding :
//overriding - when parent and child class contains same methods with same arguements.


//what things can be accessed does not depend on object type but refrence type
// Shape shape = new Square()
//in this the shape will not be able to access the element  of Square rather it will access the elements of Shapes
//What is being accessed doesn't depends on the type of object but rather on the reference of object.
//Which one its able to access is defined by object;
//so if both Shape and square contain area() method then , shape will first go for area in square then for the area method() in shape

//Parent obj = new Child();
//HEnce , which method will be called depends upon Child();
//and which method can be accessed depend upon Parent class;
//this is known as upcasting;
//like if child contain area() but parent do not then we can't access the area() even making obj of child class;


//all the static method are independent of object , so they can't be overriden
//overiden depends on object , static doesn't depend on object so u can/t override the static method


public class Main {

    int sum(int a, int b){
        return a+b;
    }
    double sum(double  a, int b){
        return a+b;
    }

    void sum(){
        System.out.println("third one");
    }



    public static void main(String[] args) {
        // Shape shapes = new Shape();
        // Circle circle = new Circle();
        // Shape square = new Square();
        // shapes.area();
        // circle.area();
        // square.area();
            Circle.greeting();
        // Main obj = new Main();
        // obj.sum(2.0,3);

    }
    
}
