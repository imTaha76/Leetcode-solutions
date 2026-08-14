// Last updated: 8/14/2026, 11:15:35 PM
1class Solution {
2    public int pivotInteger(int n) {
3        int[] nums = new int[n];
4        for(int i = 0; i <n;i++){
5            nums[i] = i+1;
6        }
7        int l = nums.length;
8        int j = 0;
9        int leftsum = 0;
10        int rightsum = 0;
11        int ans = -1;
12        while(j<n){
13            if(n==1){
14                ans =1;
15            }
16            if(j == 0){
17                leftsum = nums[0];
18                rightsum = l*(l+1) / 2 - nums[0];
19                j++;
20            }
21            else{
22                leftsum = j*(j+1)/2;
23                rightsum = l*(l+1)/2 - leftsum - nums[j];
24                if(leftsum == rightsum){
25                    ans = j+1;
26                    break;
27                }
28                j++;
29            }
30        }
31        return ans;
32
33    }
34}