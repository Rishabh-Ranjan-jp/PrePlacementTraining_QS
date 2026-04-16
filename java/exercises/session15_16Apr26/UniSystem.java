public class UniSystem {
    public static void main(String[] args) {
        Department dept = new Department("Illegitimate Uni", "Z-com", "Biological Warfare");
        dept.displayDept();
    }
}
class University{
    String uniName;

    public University(String uniName){
        this.uniName = uniName;
    }

    void displayUni(){
        System.out.println("University: "+uniName);
    }
}

class College extends University{

    String collegeName;

    public College(String uniname, String collegeName){
        super(uniname);
        this.collegeName = collegeName;
    }

    void displayCollege(){
        displayUni();
        System.out.println("College name: "+collegeName);
    }
}

class Department extends College{

    String deptName;

    public Department(String uniname, String collegename, String deptname){
        super(uniname, collegename);
        this.deptName = deptname;
    }

    void displayDept(){
        displayCollege();
        System.out.println("Department Name: "+deptName);
    }
}
