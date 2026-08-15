// Last updated: 8/16/2026, 1:00:38 AM
1import java.util.Arrays;
2import java.util.Collections;
3class Solution {
4    public List<Integer> findMissingElements(int[] nums) {
5        int n = nums.length;
6        Arrays.sort(nums);
7        ArrayList<Integer> missing = new ArrayList<>();
8        ArrayList<Integer> ans = new ArrayList<>();
9        int min = nums[0];
10        int max = nums[n-1];
11        int diff = max-min;
12
13        for(int i = min + 1;i<max;i++){
14            missing.add(i);
15        }
16        outer:
17        for(int j = 0; j <diff-1 ; j++){
18            for(int k = 0; k < n ; k++){
19                if(missing.get(j) == nums[k]){
20                   continue outer;
21                }
22                else{
23                    if(k==n-1){
24                        ans.add(missing.get(j));
25                    }
26                }
27            }
28        }
29        return ans;
30    }
31}