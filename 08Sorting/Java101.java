//insertion Sort

public class Java101 {
    public static void main(String args[]){
        int arr[] = {2,6,41,30};
        for(int i=1; i<arr.length; i++){
            int cur = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]>cur){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = cur;
        }


        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
