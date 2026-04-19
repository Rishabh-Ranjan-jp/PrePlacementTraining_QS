public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Adam", 20);
        Student s1 = new Student("James", 11, 80.21);
        Teacher t1 = new Teacher("Evelyn", 30, "AI");
        p1.displayPerson();
        s1.displayStudent();
        t1.displayTeacher();
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayPerson(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Student extends Person{
    double marks;

    Student(String name, int age, double marks){
        super(name, age);
        this.marks = marks;
    }

    void displayStudent(){
        displayPerson();
        System.out.println("Marks: "+marks);
    }
}

class Teacher extends Person{
    String subject;

    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    void displayTeacher(){
        displayPerson();
        System.out.println("Subject: "+subject);
    }
}