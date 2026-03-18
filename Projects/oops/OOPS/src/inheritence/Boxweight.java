package inheritence;

public class Boxweight extends Box{
    double weight;

    public Boxweight(){
        super();
        this.weight =-1;
    }

    public Boxweight(double l,double h,double w,double weight){
        super(l,h,w); //call the parent class constructor

        System.out.println(super.w);
        //used to refer to elements of parent class
        //we can also writ like this.w;
        //but if our parentt cclass and child class have same variable then to access the parent one we have to go like super.var else using this.var will acccess the child class variable only;
        
        this.weight = weight;
    }
}
