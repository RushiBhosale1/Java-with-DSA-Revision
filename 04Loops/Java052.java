//print reverse of number
public class Java052 {
    public static void main(String args[]){
        int n = 12356;
        while(n>0){
            System.out.print(n%10);
            n=n/10;
        }
    }
}