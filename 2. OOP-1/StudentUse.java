import java.util.*;

public class StudentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student("Anubhav", 123);
        // System.out.println(s1);
        // System.out.println(s1.name);
        // System.out.println(s1.getRollNumber());
        s1.print();

        Student s2 = new Student("Vanshika", 121);
        // System.out.println(s2);
        s2.print();

        // System.out.println(s1.numStudents);
        // System.out.println(s2.numStudents);
        System.out.println(Student.getNumStudents());
        // System.out.println(s1.getNumStudents());

        // System.out.println(s1.name);
        // System.out.println(s2.name);
        // System.out.println(s1.getRollNumber());
        // // System.out.println(s1);
    }
}
