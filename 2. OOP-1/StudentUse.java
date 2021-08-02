import java.util.*;

public class StudentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student("Anubhav");
        // System.out.println(s1.name);
        // System.out.println(s1.getRollNumber());
        s1.print();

        Student s2 = new Student("Vanshika", 121);
        s2.print();
        // System.out.println(s1.name);
        // System.out.println(s2.name);
        // System.out.println(s1.getRollNumber());
        // // System.out.println(s1);
    }
}
