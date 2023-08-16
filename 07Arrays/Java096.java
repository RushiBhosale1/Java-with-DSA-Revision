//Kadans algo to cal sum of arr
//TC O(n) SC O(1)

public class Java096 {
    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int cursum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            cursum += arr[i];
            max = Integer.max(max, cursum);
            if(cursum<0){ 
                cursum=0;
            }
        }

        System.out.println(max);
    }
}
