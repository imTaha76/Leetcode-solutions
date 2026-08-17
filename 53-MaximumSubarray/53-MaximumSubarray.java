// Last updated: 8/17/2026, 6:09:36 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int n = nums.length;
4        int sum = 0;
5        int max = Integer.MIN_VALUE;
6        for(int i = 0; i < n;i++){
7            sum += nums[i];
8            if(sum > max){
9                max = sum ;
10            }
11            if(sum < 0){
12                    sum = 0;
13            }
14            
15            
16        }
17        return max;
18    }
19}