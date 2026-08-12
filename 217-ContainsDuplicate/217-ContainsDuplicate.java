// Last updated: 8/13/2026, 12:49:13 AM
1import java.util.HashMap;
2class Solution {
3    public boolean containsDuplicate(int[] nums) {
4        boolean result = false;
5        HashMap<Integer , Integer> Counts = new HashMap<>();
6        for(int i : nums){
7            if(Counts.get(i) == null){
8                Counts.put(i , 1);
9            }
10            else{
11                Counts.put(i , Counts.get(i) + 1);
12            }
13        }
14        for(int j : nums){
15            if(Counts.get(j) > 1){
16                result = true;
17                break;
18            }
19        }
20        return result;
21    }
22}