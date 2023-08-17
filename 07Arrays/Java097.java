//Trapping Rainwater 
// TC O(n)

public class Java097 {
    public static int trappingrainwater(int height[]){
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trapedWater=0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(rightmax[i], leftmax[i]);
            trapedWater += waterlevel-height[i];
        }
        return trapedWater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        int ans = trappingrainwater(height);
        System.out.println(ans);
    }
}
