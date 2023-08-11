//display all numbers entered by user except multiple of 10

import java.util.Scanner;

public class Java055 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }
    }
}
