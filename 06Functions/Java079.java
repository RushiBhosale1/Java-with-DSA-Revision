//binomial coeficient

public class Java079 {
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

    public static int binomial(int n, int r){
        int ans = factorial(n)/(factorial(r)*(factorial(n-r)));
        return ans;
    }
    public static void main(String args[]){
        int n=5, r=2;
        int result = binomial(n, r);
        System.out.println(result);
    }
}
