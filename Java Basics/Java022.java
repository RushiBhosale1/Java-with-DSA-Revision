//Type promotion in expressions 2

public class Java022 {
    public static void main(String args[]){
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a+b+c+d;

        System.out.println(ans);   //converted to double because double is largest value
    }
}
