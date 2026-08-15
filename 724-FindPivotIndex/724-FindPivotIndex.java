// Last updated: 8/16/2026, 12:17:10 AM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int n = nums.length;
4        int[] leftSum = new int[n];
5        int[] rightSum = new int[n];
6
7        leftSum[0] = nums[0];
8        rightSum[n-1] = nums[n-1];
9        //leftsum 
10        for(int i = 1; i < n; i++){
11            leftSum[i] = leftSum[i-1] + nums[i];
12        }
13
14        //rightsum
15        for(int j = n-2; j>=0; j--){
16            rightSum[j] = rightSum[j+1] + nums[j];
17        }
18
19        for(int i = 0; i < n; i++){
20            if (leftSum[i] == rightSum[i]){
21                return i;
22            }
23        }
24        return -1;
25
26    }
27}