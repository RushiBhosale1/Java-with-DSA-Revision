//factorial of 2 numbedrs

public class Java078 {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int result = 1;
        for(int i=1; i<=n; i++){
            result*=i;
        }
        return result;
    }
    public static void main(String args[]){
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }
}
