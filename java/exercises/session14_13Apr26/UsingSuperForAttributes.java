public class UsingSuperForAttributes {
    public static void main(String[] args) {
        Son x = new Son();
        System.out.println("Son's name: "+x.name);
        System.out.println("Father's name: "+x.fatherName);
    }
}
class Parent{
    String name = "Allen";
}

class Son extends Parent{
    String name = "Patrick";
    String fatherName = super.name;
}