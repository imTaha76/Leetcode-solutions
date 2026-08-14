// Last updated: 8/15/2026, 2:21:19 AM
1class Solution {
2    public long zeroFilledSubarray(int[] nums) {
3        int n = nums.length;
4        // int[] zero_count = new int[n];
5        int count = 0;
6        // int pointer = 0;
7
8        // for(int i =0; i < n; i++){
9        //     if(nums[i] == 0){
10        //         count++;
11        //     }
12        //     else{
13        //         zero_count[pointer] = count;
14        //         pointer++;
15        //         count = 0;
16
17        //     }
18        
19        // }
20        // count = 0;
21        long sum = 0;
22        for(int j =0; j<n;j++){
23            if(nums[j] == 0){
24              count++;
25              sum = sum + count;  
26            }
27            else{
28                count = 0;
29            }
30        }
31        return sum;
32    }
33}