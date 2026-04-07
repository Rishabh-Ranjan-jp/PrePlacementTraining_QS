public class StudentDemo {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student("Adam");
        Student obj2 = new Student("Ellen", 23);
        Student obj3 = new Student("Stanley", 22, 111);
    }
}

class Student{
    
    String name;
    int age, id;

    Student(){

    }

    Student(String name){
        this.name = name;
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
}