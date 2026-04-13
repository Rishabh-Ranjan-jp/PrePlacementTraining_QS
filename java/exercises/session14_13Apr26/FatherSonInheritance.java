public class FatherSonInheritance {
    public static void main(String[] args) {
        Son s1 = new Son(1, "Able");
    }
}

class Father{
    String name;

    Father(String name){
        this.name = name;
    }
}

class Son extends Father{
    int sid;

    Son(int sid, String name){
        super(name);
        //instead of writing this.name = name, we call the constructor of super.
        this.sid = sid;
    }
}