// Last updated: 8/13/2026, 12:59:27 AM
1import java.util.HashSet;
2class Solution {
3    public boolean containsDuplicate(int[] nums) {
4        boolean result = false;
5        HashSet<Integer> Counts = new HashSet<Integer>();
6        for(int i : nums){
7            if(!Counts.add(i)){
8                result = true;
9            }
10        }
11        return result;
12    }
13}