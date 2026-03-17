class MethodOverloadingDemo{
    public static int add(int a, int b){
        return a+b;
    }
    public static float add(float a, float b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }

    public static int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        int w = 30;
        int z = 40;
        float k = 3.14f;
        float l = 2.71f;
        double h = 55555.778332;
        double u = 12345.247472;

        System.out.println(String.format("Adding: %d, %d: %d", x, y, add(x, y)));
        System.out.println(String.format("Adding: %d, %d, %d, %d: %d", x, y, w, z, add(x, y, w, z)));
        System.out.println(String.format("Adding: %.2f, %.2f: %.2f", k, l, add(k, l)));
        System.out.println(String.format("Adding: %.2f, %.2f: %.2f", h, u, add(h, u)));
    }
}