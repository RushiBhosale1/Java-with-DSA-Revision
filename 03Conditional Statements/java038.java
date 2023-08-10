//Largest of three number
public class java038 {
    public static void main(String args[]){
        int a=1, b=3, c=6;
        if((a>=b) && (a>=c)){
            System.out.println("a is greatest");
        }else if((b>=c)){
            System.out.println("b is greatest");
        }else{
            System.out.println("c is greatest");
        }
    }
}
