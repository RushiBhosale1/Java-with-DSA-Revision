//keep entering numbers till user enters a multiple of 10

import java.util.Scanner;

public class Java050 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        while(true){
            n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.err.println(n);
        }
    }
}
