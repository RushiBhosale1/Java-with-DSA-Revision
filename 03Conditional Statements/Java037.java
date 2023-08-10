//Income tax calculator

import java.util.Scanner;

public class Java037 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;                                //Java automatically initialize to zero
        if(income<=500000){
            tax = 0;
        }else if(income<=1000000 && income>500000){
            tax = (int) (income * 0.2);
        }else{
            tax = (int) (income * 0.3);
        }

        System.out.println("Tax is " + tax);
    }
}