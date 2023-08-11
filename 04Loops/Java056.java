//check if number is prime or not

public class Java056 {
    public static void main(String args[]){
        int n = 7;
        boolean flag = true;
        if(n==2){
            System.out.println("2 is prime");
        }else{
            for(int i=2; i<=(int)(Math.sqrt(n)); i++){
                if(n%i==0){
                    flag = false;
                    break;
                }
            }
        }
        if(flag == true){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
