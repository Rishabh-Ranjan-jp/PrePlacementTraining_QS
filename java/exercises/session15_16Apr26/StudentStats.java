public class StudentStats {
    public static void main(String[] args) {
        Result rx = new Result("Adam",87);
        Result ry = new Result("James", 79);
        rx.calculateGrade();
        ry.calculateGrade();
    }
}
class Student{
    int marks;
    String name;

    public Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails(){
        System.out.println("Student name: "+name+" Student mark: "+marks);
    }
}

class Result extends Student{

    String grade;

    public Result(String name, int marks){
        super(name, marks);
    }

    void calculateGrade(){
        if(marks > 90){
            grade = "A";
        }else if(marks > 80){
            grade = "B";
        }else{
            grade = "F";
        }
        displayDetails();
        System.out.println("Student grade: "+grade);
    }
}