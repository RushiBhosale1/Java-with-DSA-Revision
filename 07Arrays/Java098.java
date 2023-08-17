//Buy and sell stocks

public class Java098 {
    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        int buyprice = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0; i<price.length; i++){
            if(buyprice>price[i]){
                buyprice=price[i];
            }else{
                int curprofit = price[i]-buyprice;
                profit = Math.max(curprofit, profit);
            }
        }
        System.out.println(profit);
    }
}
