//Type Casting/narrowing/explicit

import java.util.Scanner;

public class Java018 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = 25.9999f;
        int b = (int) a;   //lossy conversion
        System.out.println(b);
    }
}
