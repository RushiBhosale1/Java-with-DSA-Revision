//liner Search
public class java088 {
    public static int linerSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {5,4,7,9,1};
        int key = 9;
        int result = linerSearch(arr, key);
        if(result == -1){
            System.out.println("Key Not found");
        }
        else{
            System.out.println("Key found at index "+result);
        }
    }
}
