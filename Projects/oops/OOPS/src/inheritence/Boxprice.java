package inheritence;

public class Boxprice extends Boxweight {
    double price;

    public Boxprice() {
        super();
        this.price=-1;
    }

     Boxprice (Boxprice old) {
        super(old.h,old.l,old.w,old.weight);
        this.price = old.price;
    }

    public Boxprice(double price){
        super();
        this.price = price;

    }

    public Boxprice(double l,double w,double h,double weight,double price){
        super(l, h, w, weight);
        this.price =price;

    }

    

    
}
