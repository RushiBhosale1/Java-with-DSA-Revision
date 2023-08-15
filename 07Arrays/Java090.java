//binary search

public class Java090 {
    public static int binarySearch(int arr[], int key){
        int s = 0;
        int e = arr.length-1;

        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]<key){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,6,8,40,50,97,400};   //array should sorted whether ascending or decending 
        int idx = binarySearch(arr, 97);
        if(idx==-1){
            System.out.print("Not found");
        }else{
            System.out.println("Found at index "+ idx);
        }
    }
}
