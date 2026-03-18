public class Car extends Vehicle {

    int trunkSize;

    public Car(int trunkSize, String make, String model, int year) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

}
