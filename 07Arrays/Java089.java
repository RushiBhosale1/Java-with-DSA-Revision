//find largest in array
public class Java089 {
    public static int findLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int arr[] = {2,4,9,1,30,87,95,45};
        int largest = findLargest(arr);
        System.out.println(largest);
    }
}
