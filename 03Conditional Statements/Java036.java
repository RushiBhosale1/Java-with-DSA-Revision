//else if

public class Java036 {
    public static void main(String args[]){
        int age = 18;
        if(age>=18){
            System.out.println("You are adult");
        }
        else if(age>13 && age<18){                                                          //more optimized and correct
            System.out.println("teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }
}
