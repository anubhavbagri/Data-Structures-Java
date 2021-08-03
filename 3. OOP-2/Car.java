public class Car extends Vehicle {

    int numGears;
    boolean isConvertible;

    public Car(int numGears, int maxSpeed) {
        super(maxSpeed); // specifically calling vehicle constructor with maxSpeed
        this.numGears = numGears;
        System.out.println("Car constructor!");
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void print() {
        super.print();
        System.out.println("Car numGears : " + numGears);
        System.out.println("Car isConvertible : " + isConvertible);
    }
}
