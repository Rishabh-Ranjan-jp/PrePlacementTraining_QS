package solutions;

public class Person {
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age < 0 || age > 120){
            System.out.println("Please enter a valid age between 0 and 120. "+age+" is not a valid age.");
            return ;
        }
        this.age = age;
        System.out.println("Age of this person is: "+getAge());
    }
}
