public class NonParameterizedStudent {
    public static void main(String[] args) {
        Student s1 = new Student();


        System.out.println("Student Id: "+s1.studentId);
        System.out.println("Student Name: "+s1.name);
        System.out.println("Student course: "+s1.course);
        System.out.println("Student marks: "+s1.marks);
        
    }
}

class Student{
    int studentId, marks;
    String name, course;
    public Student(){
        studentId = 1;
        name = "Adam";
        course = "AI";
        marks = 55;
    }
}