//Check prime numbers in range

public class Java082 {
    public static boolean isprime(int n){
        if(n==2){
            return true;
        }

        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void checkPrime(int n){
        for(int i=2; i<=n; i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String args[]){
        int n = 100;
        checkPrime(n);
    }
}
