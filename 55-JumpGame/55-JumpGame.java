// Last updated: 9/29/2026, 12:53:35 AM
1class Solution {
2    static boolean recursion(int[] nums , int index,Boolean[] dp){
3        if(dp[index] != null){
4            return dp[index];
5        }
6        if(index == nums.length-1){
7            return true;
8        }
9        if(index >= nums.length){
10            return false;
11        }
12        if(nums[index] == 0){
13            return false;
14        }
15        boolean finalans = false;
16        int jumpvalue = nums[index];
17        for(int jump = 1;jump<=jumpvalue ; jump++){
18            boolean recvalue = recursion(nums , index+jump,dp);
19            finalans = finalans || recvalue;
20            if(finalans == true){
21                break;
22            }
23        }
24        dp[index] = finalans;
25        return finalans;
26    }
27    public boolean canJump(int[] nums) {
28        int index = 0;
29        Boolean[] dp = new Boolean[nums.length];
30        boolean ans = recursion(nums , index ,dp);
31        return ans;
32    }
33}