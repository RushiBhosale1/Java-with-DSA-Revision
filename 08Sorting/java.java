public class java {
    public static void main(String args[]){
        int arr[] = {2,6,8,4,1};
        int i=3;
        int cur = arr[i];
        int prev = i-1;
        arr[prev+1] = cur;
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
