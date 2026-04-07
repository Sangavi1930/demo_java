class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);   
        this.course = course;
    }
    void displayStudent() {
        displayPerson();
        System.out.println("Course: " + course);
    }
}

public class thissuper {
    public static void main(String[] args) {

        Student s1 = new Student("Sangavi", 20, "IT");
        s1.displayStudent();

    }
}