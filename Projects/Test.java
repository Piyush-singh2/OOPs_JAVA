



class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
}

class Student {
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Test{

    public static void main(String[] args) {
        Pen pen1 = new Pen();

       pen1.color = "Blue";
       pen1.type = "Gel"; 


       Student s1 = new Student();
       s1.name = "shradha";
    }
}
