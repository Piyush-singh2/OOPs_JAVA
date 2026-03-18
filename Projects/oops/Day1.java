class Teacher {
    String name;
    int age;
    int experience;
    int salary;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.experience);
        System.out.println(this.salary);
    }
}

class School {
    String name;
    String address;
    int noOfTeachers;
    int noOfStudents;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.noOfTeachers);
        System.out.println(this.noOfStudents);
    }

  School(String name,String address,int noOfTeachers,int noOfStudents){
      this.name = name;
      this.address = address;
      this.noOfTeachers = noOfTeachers;
      this.noOfStudents = noOfStudents;
  }
    
}

public class Day1 {
    public static void main(String[] args) {
       
         Teacher t1 = new Teacher();
    
         t1.name = "Anjali";
         t1.age = 30;
         t1.experience = 5;
         t1.salary = 50000;
    
         t1.printinfo();

         School s1 = new School("ram manohar","Dhanbad,Jharkhand",50,2000);
         s1.printinfo();
    }
}