class MethodFLow{
    public static void main(String[] args){
        System.out.println("Main starts here: ");
        System.out.println("Calling demo method now: ");
        demo();
        System.out.println("Main ends here");
    }
    static void demo(){
        System.out.println("Control is now in the demo method");
        System.out.println("Exiting from demo now.");
    }
}