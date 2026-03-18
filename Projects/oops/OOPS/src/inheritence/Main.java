package inheritence;

public class Main {
    public static void main(String[] args) {
        // Box box = new Box(45,78,67);
        // Box box2 = new Box(box);
        // System.out.println(box.h + " " + box.w + " " + box.l);
        
        // Boxweight box3 = new Boxweight(23,45,67,89);
        // System.out.println(box3.h + " " + box3.l + " "+ box3.w +" "+ box3.weight);
        
        // Box box4 =new Boxweight(12, 34, 34, 54);
        // System.out.println(box4.l);

        Boxweight box6 = new Boxweight();
        System.out.println(box6.h+"  "+box6.l);

        Boxprice box5 = new Boxprice(12,12,12,12,12);
        //System.out.println(box5.price);

    }
}





//types of inheritence :
//Single inhertence
//multilevel inheritence : one  class derives from parent class , and that class itself act as parent for other class

