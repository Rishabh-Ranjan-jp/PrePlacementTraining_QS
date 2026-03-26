public class NonStaticStudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("Student Id: "+s1.studentId);
        System.out.println("Student Name: "+s1.name);
        System.out.println("Student course: "+s1.course);
        System.out.println("Student marks: "+s1.marks);

        s1.course = "AI";
        s1.name = "Sam";
        s1.marks = 55;
        s1.studentId = 1;
    
        System.out.println("Student Id: "+s1.studentId);
        System.out.println("Student Name: "+s1.name);
        System.out.println("Student course: "+s1.course);
        System.out.println("Student marks: "+s1.marks);
    }    
}

class Student{
    int studentId;
    int marks;
    String name;
    String course;
}

