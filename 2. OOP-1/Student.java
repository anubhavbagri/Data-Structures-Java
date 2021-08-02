public class Student {
    public String name;
    private int rollNumber;

    public void setRollNumber(int rn) {
        if (rn <= 0) {
            return;
        }
        rollNumber = rn;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}