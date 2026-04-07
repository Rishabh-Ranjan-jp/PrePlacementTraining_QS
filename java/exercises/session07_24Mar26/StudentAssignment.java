public class StudentAssignment {
    public static void main(String[] args){
        Student s1 = new Student(1, "Adam", "Programming in C", 91);
        Student s2 = new Student(2, "Jason", "AI", 65);
        Student s3 = new Student(3, "Evelyn", "Discrete Math", 50);

    
        s1.displayStudentDetails();
        System.out.println("Grade: "+s1.calculateGrade());
        s2.displayStudentDetails();
        System.out.println("Grade: "+s2.calculateGrade());
        s3.displayStudentDetails();
        System.out.println("Grade: "+s3.calculateGrade());

    }
}

class Student{
    private int studentId;
    private String name;
    private String course;
    private int marks;

    Student(
        int studentId, 
        String name, 
        String course, 
        int marks
    ){
        this.marks = marks;
        this.name = name;
        this.studentId = studentId;
        this.course = course;
    }

    void displayStudentDetails(){
        System.out.println(String.format("Student ID: %d | Student Name: %s | Course: %s | Marks: %d", this.studentId, this.name, this.course, this.marks));
    }

    String calculateGrade(){
        if(this.marks > 80)
            return "A";
        else if(this.marks > 60)
            return "B";
        else
            return "F";
    }

}
