//Swap 2 numbers

public class Java076 {
    public static void swap(int a, int b){               //copy of a,b   //Call by value
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);     //10
        System.out.println(b);     //5
    }
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println(a);        //5          Call by value
        System.out.println(b);        //10
    }
}
