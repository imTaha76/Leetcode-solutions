// Last updated: 8/13/2026, 12:40:44 AM
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[2*n-i-1] = nums[i];
        }
        return ans;





        // int n = nums.length;
        // int[] dup = new int[2*n];
        // dup = nums;
        // int[] reverse = new int[n];
        // for (int i = 0; i < n; i++){
        //     if(nums[i] == nums[n-1-i]){
        //         break;
        //     }
        //     int temp = nums[i];
        //     nums[i] = nums[n-i-1];
        //     nums[n-i-1] = temp;
        // }
        // reverse = nums;
        // for(int i = 0; i < n; i++){
        //     for (int j = 0; j < n; j++){
        //         dup[n+j] = reverse[i];
        //     }
        // }
        // return dup;

    }
}