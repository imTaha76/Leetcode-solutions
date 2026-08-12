// Last updated: 8/13/2026, 12:41:00 AM
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0 ; i < nums.length ; i++ ){
            for(int j = 1 ; j <= nums.length-1 ; j++){
                if(i!=j){
                    if( nums[i] + nums[j] == target){
                        arr[0] = i;    
                        arr[1] = j;    
                    }
                    
                }
                
            }
        }
        return arr;
    }
}