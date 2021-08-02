public class Student {
    public String name;
    private int rollNumber;

    // public Student() {
    // rollNumber = 100;
    // }

    public Student(String n) {
        name = n;
    }

    public Student(String n, int rn) {
        name = n;
        rollNumber = rn;
    }

    public void setRollNumber(int rn) {
        if (rn <= 0) {
            return;
        }
        rollNumber = rn;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void print() {
        System.out.println(name + " : " + rollNumber);
    }
}