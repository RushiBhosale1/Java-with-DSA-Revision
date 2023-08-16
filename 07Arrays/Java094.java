//Maximum Subarrays sum O(n^3)

public class Java094 {
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int count = 0;
                for(int k=i; k<=j; k++){
                    count+=arr[k];
                }
                max = Math.max(max, count);
            }
        }
        System.out.println(max);
    }
}
