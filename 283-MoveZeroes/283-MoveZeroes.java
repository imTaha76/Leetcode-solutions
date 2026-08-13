// Last updated: 8/14/2026, 12:03:41 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n = nums.length;
4        int j = 0;
5        for(int i = 0; i < n; i++){
6            if(nums[i] != 0){
7                nums[j] = nums[i];
8                j++;
9            }
10        }
11        while(j < n){
12            nums[j] = 0;
13            j++;
14        }
15
16        System.out.print(nums);
17
18      
19    }
20}