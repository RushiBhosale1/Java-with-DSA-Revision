//sum of two numbers

import java.util.Scanner;

public class Java075 {
    public static void calSum(int num1, int num2){
        System.out.println("Sum  is : " + (num1+num2));          //brackets are important
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calSum(a, b);                 //actual parameters
    }
}
