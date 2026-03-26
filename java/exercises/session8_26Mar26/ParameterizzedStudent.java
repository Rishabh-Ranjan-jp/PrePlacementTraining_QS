public class ParameterizzedStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Adam", "AI", 1, 55);
        Student.displayDetails(s1);
    }
}

class Student{
    String name, course;
    int marks, studentId;

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

