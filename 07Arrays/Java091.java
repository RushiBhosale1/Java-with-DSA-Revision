//Reverse an array
//TC O(n)   SC O(1)
public class Java091 {
    public static void reverseArray(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String args[]){
        int arr[] = {2,4,8,47,65};
        reverseArray(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
