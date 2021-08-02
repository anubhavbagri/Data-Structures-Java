public class Student {
    public String name;
    // final data members can be initialized as soon as they are declared.
    private final int rollNumber;

    // public Student() {
    // rollNumber = 100;
    // }

    // public Student(String n) {
    // name = n;
    // rollNumber = 100;
    // }

    public Student(String n, int rn) {
        name = n;
        rollNumber = rn;
    }

    // public void setRollNumber(int rn) {
    // if (rn <= 0) {
    // return;
    // }
    // rollNumber = rn;
    // }

    public int getRollNumber() {
        return rollNumber;
    }

    public void print() {
        System.out.println(name + " : " + rollNumber);
    }
}