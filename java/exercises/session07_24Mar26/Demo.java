class Demo{
    public static void main(String[] args){
        X a = null;
        System.out.println(a);
        a = new X();
        System.out.println(a);
    }
}


class X{
    int x = 10;
}