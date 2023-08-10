public class Java033 {
    public static void main(String args[]){
        int age = 16;
        if(age>=18){
            System.out.println("You are adult");
        }
        if(age>13 && age<18){                                                          //always checks but what if above condition is true, here come else if
            System.out.println("teenager");
        }
        else{
            System.out.println("Not adult");
        }
    }
}
