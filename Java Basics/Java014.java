//Area of Circle

import java.util.Scanner;

public class Java014 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = 3.14f*radius*radius;
        System.out.println(area);
    }
}


//if we write any decimal value in java then it is treated as double