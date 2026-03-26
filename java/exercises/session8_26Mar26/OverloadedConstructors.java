public class OverloadedConstructors {
    public static void main(String[] args) {
        Student[] students = {
            new Student(1, 55),
            new Student("James", "Programming"),
            new Student("Evelyn", "Machine Learning"),
            new Student("John", "Data Science", 4, 84)
        };

        for(Student x: students){
            Student.displayDetails(x);
        }
    }
}

class Student{
    String name, course;
    int marks, studentId;

    Student(String a, int b){
        name = a;
        studentId = b;
    }

    Student(String a, String b){
        name = a;
        course = b;
    }

    Student(int a, int b){
        studentId = a;
        marks = b;
    }

    Student(String a, String b, int c, int d){
        name = a;
        course = b;
        studentId = c;
        marks = d;
    }

    public static void displayDetails(Student x){
        System.out.println();
        System.out.println("Student Id: "+x.studentId);
        System.out.println("Student Name: "+x.name);
        System.out.println("Student course: "+x.course);
        System.out.println("Student marks: "+x.marks);
        System.out.println();
    }
}