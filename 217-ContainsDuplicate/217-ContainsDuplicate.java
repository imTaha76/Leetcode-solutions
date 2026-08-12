// Last updated: 8/13/2026, 12:52:05 AM
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
12                result = true;
13                break;
14            }
15        }
16        // for(int j : nums){
17        //     if(Counts.get(j) > 1){
18        //         result = true;
19        //         break;
20        //     }
21        // }
22        return result;
23    }
24}