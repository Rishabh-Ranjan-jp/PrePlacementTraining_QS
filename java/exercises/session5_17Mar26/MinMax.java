class MinMax{
    public static int minReturn(int a, int b){
        return a<b ? a : b;
    }

    public static int maxReturn(int a, int b){
        return a>b ? a : b;
    }

    public static void main(String[] args){
        int x = 10; 
        int y = 20;

        System.out.println(String.format("Max of (%d, %d): %d", x, y, maxReturn(x, y)));
        System.out.println(String.format("Min of (%d, %d): %d", x, y, minReturn(x, y)));
    }
}