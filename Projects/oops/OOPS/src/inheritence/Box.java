package inheritence;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        super();
        this.h = -1;
        this.l = -1;
        this.w = -1;
        
    }
    //cubbe
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }
    Box(double l,double h,double w){
        this.l=l;
        this.w=w;
        this.h=h;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Box is running.");
    }
}
