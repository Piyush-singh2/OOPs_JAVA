
    class Students{
        int rno;
        String name;
        float marks = 90;

    public Students() {
        this(13, "Default name");
    }


        

    public Students(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }

        
    }

    class A {
        final int num= 10;
        String name;
        
        public  A(String name){
            this.name = name;
        }
        @Override
        protected void finalize() 
                            throws Throwable{
            System.out.println("Object is destroyed");
        }
    }



public class Day2{
    public static void main(String[] args) {

        Students s1;
        s1 = new Students(13,"piyusj");
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.marks);


        Students s2 = s1;
        s2.name = "ram";
        System.out.println(s2.name);
        System.out.println(s1.name);

        Integer num = 45;
        num.toString();

        final A kunal = new A("Kunal  khuswaha");
        System.out.println(kunal.name);
        System.out.println(kunal.name);

        A obj;
        for (int i = 0; i < 200000; i++) {
            obj = new A("Random name");
            
        }


    }


}