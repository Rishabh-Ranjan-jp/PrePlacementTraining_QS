public class AbstractWorker {
    public static void main(String[] args) {
        Worker[] list = {
            new Teacher(),
            new Student(),
            new Developer()
        };

        for(Worker x: list){
            x.work();
        }
    }
}

abstract class Worker{
    abstract void work();
}

class Teacher extends Worker{
    void work(){
        System.out.println("Teacher is grading papers.");
    }
}

class Student extends Worker{
    void work(){
        System.out.println("Student is studying.");
    }
}

class Developer extends Worker{
    void work(){
        System.out.println("Developering is developing a new application.");
    }
}