package OOP;

//import java.util.*;


class Student {
    // String name;
    // int age;

    // void study() {
    //     System.out.println(name + " is studying");
    // }
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal1 {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class basicImplementation {
    public static void main(String[] args) {
        // Student s1 = new Student();

        // s1.name = "Prajwal";
        // s1.age = 20;

        // s1.study();
        Student s = new Student();

        s.setAge(20);

        System.out.println(s.getAge());

        Dog d = new Dog();

        d.eat();   // inherited
        d.bark();  // Dog's own method

        Animal1 a = new Dog1();

        a.sound();
    }
}
