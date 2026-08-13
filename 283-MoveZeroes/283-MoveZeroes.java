// Last updated: 8/13/2026, 11:49:44 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int j = 0;
4
5        // Move all non-zero elements to the front
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] != 0) {
8                nums[j] = nums[i];
9                j++;
10            }
11        }
12
13        // Fill the remaining positions with zero
14        while (j < nums.length) {
15            nums[j] = 0;
16            j++;
17        }
18    }
19}