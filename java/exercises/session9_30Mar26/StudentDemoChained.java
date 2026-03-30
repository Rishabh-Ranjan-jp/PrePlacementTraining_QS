public class StudentDemoChained {
    public static void main(String[] args) {
        System.out.println();
        Student obj = new Student();
        System.out.println();
        Student obj1 = new Student("Adam");
        System.out.println();
        Student obj2 = new Student("Ellen", 23);
        System.out.println();
        Student obj3 = new Student("Stanley", 22, 111);
    }
}

class Student{
    
    String name;
    int age, id;

    Student(){
        System.out.println("No args constructor");
    }

    Student(String name){
        this.name = name;
        System.out.println("Name constructor");
    }

    Student(String name, int age){
        this(name);
        this.age = age;
        System.out.println("Name + Age constructor");
    }

    Student(String name, int age, int id){
        this(name, age);
        this.id = id;
        System.out.println("Name + Age + Id constructor");
    }
}