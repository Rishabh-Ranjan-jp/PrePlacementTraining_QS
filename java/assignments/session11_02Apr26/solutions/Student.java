package solutions;

public class Student {
    
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
        System.out.println("Set the name of the student to: "+getName());
    }

    public void setAge(int age){
        this.age = age;
        System.out.println("Set the age of the Student to: "+getAge());
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
