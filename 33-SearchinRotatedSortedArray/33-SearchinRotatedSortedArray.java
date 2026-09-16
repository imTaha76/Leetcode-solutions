// Last updated: 9/17/2026, 12:59:10 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        // int pivotidx = 0;
5        // for(int i = 0 ; i<n ; i++){
6        //     if(nums[i] > nums[i+1]){
7        //        pivotidx = i+1;
8        //     }
9        // }
10        
11        // int rotations = n - pivotidx;
12        // if()
13        for(int i = 0; i<n; i++){
14            if(nums[i] == target){
15                return i;
16            }
17        }
18
19    return -1;
20    }
21}