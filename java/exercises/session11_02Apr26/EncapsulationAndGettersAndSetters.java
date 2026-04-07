public class EncapsulationAndGettersAndSetters {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAge(20);
        student1.setName("Steven");
        student1.setCourse("AIML");
        student1.setSid(1);
        System.out.println(String.format("ID: %d | Name: %s | Course: %s | Age: %d |", student1.getSid(), student1.getName(), student1.getCourse(), student1.getAge()));
    }
}

class Student{
    private int sid;
    private int age;
    private String name;
    private String course;

    public void setSid(int sid){
        this.sid = sid;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getSid(){
        return sid;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getCourse(){
        return course;
    }

}