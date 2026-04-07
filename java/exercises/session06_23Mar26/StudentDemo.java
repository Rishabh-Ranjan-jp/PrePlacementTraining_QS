class Student {
    private int id;
    private String name;
    private int age;

    Student(){};

    Student(
        int id,
        String name, 
        int age
    ){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void studying(){
        System.out.println(String.format("Student Name: %s, ID: %d is studying.",this.name, this.id));
    }

    void coding(){
        System.out.println(String.format("Student Name: %s, ID: %d is coding.",this.name, this.id));

    }
    void display(){
        System.out.println(String.format("Student Name: %s | Student ID: %d | Student Age: %d.",this.name, this.id, this.age));
       
    }
}


public class StudentDemo{

    public static void main(String[] args){
    
    Student s1 = new Student(1, "adam", 20);
    s1.display();
    s1.coding();
    s1.studying();
    
    Student s2 = new Student(2, "James", 21);
    Student s3 = new Student(3, "Eve",20);

    Student[] group = {s2, s3};
    
    for(Student x:  group){
        System.out.println();
        x.display();
        x.coding();
        x.studying();
        System.out.println();

    }
    }
}

