//reverse the given number

public class Java053 {
    public static void main(String args[]){
        int n = 10899;
        int result = 0;
        while(n>0){
            int ld = n%10;
            result = (result*10) + ld;
            n/=10;
        }
        System.out.println(result);
    }
}
