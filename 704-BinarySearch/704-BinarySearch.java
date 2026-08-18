// Last updated: 8/18/2026, 11:38:40 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int start = 0;
5        int end = n-1;
6        while(start<=end){
7            int mid = (start + end)/2;
8            if(target == nums[mid]){
9                return mid;
10            }
11            if(target > nums[mid]){
12                start = mid + 1;
13            }
14            else{
15                end = mid - 1;
16            }
17        }
18        return -1;
19    }
20}