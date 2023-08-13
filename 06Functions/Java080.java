//function overloading

public class Java080 {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String args[]){
        System.out.println(sum(2, 1, 5));
        System.out.println(sum(5.1f, 4.2f));
        System.out.println(sum(4, 5));
    }
}
