import java.util.*;

public class StudentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "Anubhav";
        s1.rollNumber = 123;

        Student s2 = new Student();
        s2.name = "Vanshika";
        s2.rollNumber = 121;

        System.out.println(s1.name);
        System.out.println(s2.name);
        // System.out.println(s1);
    }
}
