public class MethodOverloadingForPolymorphism {
    public static void main(String[] args) {
        Calc x = new Calc();
        x.add();
        x.add(1,2);
        x.add(1,2,3);
        x.add(1,2,3,4);
    }
}

class Calc{
    public void add(){
        System.out.println("Nothing to add");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }

    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public void add(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }
}