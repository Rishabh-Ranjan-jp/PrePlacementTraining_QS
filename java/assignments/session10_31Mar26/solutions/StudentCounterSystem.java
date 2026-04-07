package solutions;

public class StudentCounterSystem {
    private String name;
    private int age;

    static int totalStudents = 0;

    public StudentCounterSystem(String name, int age){
        totalStudents++;
        this.name = name;
        this.age = age;
        showCreatedStudent();
    }

    public static void showStudentCount(){
        System.out.println("Total number of students: "+totalStudents);
    }

    private void showCreatedStudent(){
        System.out.println(String.format("New student created:: Name: %s |", this.name));
    }

}
