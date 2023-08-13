//binary to decimal

public class Java083 {
    public static int binaryToDecimal(int n){
        int decimal = 0;
        int pow = 0;
        while(n>0){
            int ld = n%10;
            decimal = decimal + (int)(ld * Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        return decimal;
    }
    public static void main(String args[]){
        int n = 1010;
        int ans = binaryToDecimal(n);
        System.out.println(ans);
    }
}
