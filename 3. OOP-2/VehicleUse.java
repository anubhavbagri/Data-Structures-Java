public class VehicleUse {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle();
        // v.color = "Red";
        // v.setMaxSpeed(10);
        // v.print(); // print method of Vehicle would be called

        Vehicle v = new Car(10, 20); // Every Vehicle can be a Car

        v.print();

        Car c = new Car(10, 100); // when we make the object of the child class, it also makes the object of the
        // parent class
        c.color = "Black";
        c.setMaxSpeed(100);
        // c.print(); // print method of Car would be called
    }
}
