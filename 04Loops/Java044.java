//print numbers from 1 to n

import java.util.Scanner;

public class Java044 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int n = sc.nextInt();
        while(counter<=n){
            System.out.print(counter + " ");
            counter++;
        }
    }
}
