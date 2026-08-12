// Last updated: 8/13/2026, 1:01:39 AM
1import java.util.HashMap;
2class Solution {
3    public boolean containsDuplicate(int[] nums) {
4        boolean result = false;
5
6        //Using a HashMap
7        HashMap<Integer , Integer> Counts = new HashMap<>();
8        for(int i : nums){
9            if(Counts.get(i) == null){
10                Counts.put(i , 1);
11            }
12            else{
13                Counts.put(i , Counts.get(i) + 1);
14                result = true;
15                break;
16            }
17        }
18        
19        //Using HashSet instead of a HashMap
20        // HashSet<Integer> Counts = new HashSet<Integer>();
21        // for(int i : nums){
22        //     if(!Counts.add(i)){
23        //         result = true;
24        //     }
25        // }
26        
27        return result;
28    }
29}