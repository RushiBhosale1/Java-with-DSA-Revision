//input in array

import java.util.Scanner;

public class Java086 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[50];
        marks[0] = sc.nextInt();   //phy
        marks[1] = sc.nextInt();   //chem
        marks[2] = sc.nextInt();   //math

        marks[1] = marks[1] + 2;      //we can update array
        System.out.println("Marks of phy : " + marks[0]);
        System.out.println("Marks of chem : " + marks[1]);
        System.out.println("Marks of math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println(percentage);
        
    }
}
