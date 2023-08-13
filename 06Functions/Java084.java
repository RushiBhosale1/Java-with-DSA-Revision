//convert from decimal to binary

public class Java084 {
    public static int decimalToBinary(int n){
        int binary = 0;
        int pow = 0;
        while(n>0){
            int rem = n%2;
            binary = binary + (int)(rem * Math.pow(10, pow));
            pow++;
            n = n/2;
        }
        return binary;
    }
    public static void main(String args[]){
        int n = 10;
        int ans = decimalToBinary(n);
        System.out.println(ans);
    }
}
