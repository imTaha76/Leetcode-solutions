// Last updated: 8/13/2026, 12:40:43 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int i = 0;
        int j = n-1;
        while (i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;

        }
        // k  elements reversal
            i = 0;
            j = k-1;
        while (i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;

        }
            i = k;
            j = n-1;
        while (i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;

        }


        // while (k!= 0){
        // int i = n-1;
        //     int temp = nums[n-1];
        //     while(i>0) {
        //         nums[i] = nums[i-1];
        //         i--;
        //     } 
        //     nums[0] = temp;
        //     k--;

        // }
        // System.out.print(nums);
    }
}