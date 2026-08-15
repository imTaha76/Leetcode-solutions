// Last updated: 8/15/2026, 11:49:15 PM
1import java.util.Arrays;
2class Solution {
3    public List<List<Integer>> threeSum(int[] nums) {
4        Set<List<Integer>> result = new HashSet<>();
5        int n = nums.length;
6        Arrays.sort(nums);
7        // int i = 0;
8        for(int i = 0; i < n-2; i++){
9
10        int j = i+1;
11        int k = n-1;
12        while(j<k){
13            if(nums[i] + nums [j] + nums[k] == 0){
14                ArrayList<Integer> ans = new ArrayList<>();
15                ans.add(nums[i]);
16                ans.add(nums[j]);
17                ans.add(nums[k]);
18                Collections.sort(ans);
19                result.add(ans);
20                j++;
21                k--;
22            }
23            else if(nums[i] + nums [j] + nums[k] < 0){
24                // if(j == k){
25                //     i++;
26                //     j = i+1;
27                //     k = n-1;
28                // }
29                j++;
30            }
31            else{
32                k--;
33            }
34
35        }
36        }
37        return new ArrayList(result);
38
39    }
40}