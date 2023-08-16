//prefix method to max subarray O(n^2)  
//TC O(n^2)    SC O(n)

public class Java095 {
    public static void main(String args[]){
        int arr[] = {1,-2,6,-1,3};
        int max = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = arr[i]+prefix[i-1];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int cursum = i==0 ? prefix[j]:prefix[j]-prefix[i-1];
                max = Math.max(max, cursum);
            }
        }
        System.out.println(max);
    }
}
