// Last updated: 8/13/2026, 12:40:56 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(target <= nums[i]){
                ans = i;
                break;
            }
            else{
                ans = n;
            }
        }
        return ans;

    }
}