import java.util.*;
 

class Student {
    String name;
    int age;
    int rollNo;
    double marks;

    Student(String name, int age, int rollNo, double marks) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

public class studentClass {
    public static void main(String[] args) {
        Student s1 = new Student("Shashank", 19, 2511128, 8.8);
        Student s2 = new Student("Ruturaj", 19, 2511224, 8.5);
        Student s3 = new Student("--", 19, 2511128, 8.8);
        Student s4 = new Student("--", 19, 2511128, 8.8);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
