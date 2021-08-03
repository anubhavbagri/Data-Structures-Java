public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.color = "Red";
        v.setMaxSpeed(10);
        v.print(); // print method of Vehicle would be called

        Car c = new Car();
        c.numGears = 10;
        c.color = "Black";
        c.setMaxSpeed(100);
        c.print(); // print method of Car would be called
    }
}
