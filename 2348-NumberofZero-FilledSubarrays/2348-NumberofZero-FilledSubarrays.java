// Last updated: 8/15/2026, 2:23:28 AM
1class Solution {
2    public long zeroFilledSubarray(int[] nums) {
3        int n = nums.length;
4        int count = 0;
5        long sum = 0;
6        for(int j =0; j<n;j++){
7            if(nums[j] == 0){
8              count++;
9              sum = sum + count;  
10            }
11            else{
12                count = 0;
13            }
14        }
15        return sum;
16    }
17}