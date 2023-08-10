public class Java031 {
    public static void main(String args[]){
        int a = 10;
        int b = a;
        a+=5;     //a = a+5   15   high speed then a=a+5 
        b-=5;     //b = b-5   5    high speed then b=b+5
        System.out.println(a);
        System.out.println(b);
    }
}
