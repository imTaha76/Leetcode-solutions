// Last updated: 8/13/2026, 12:40:47 AM
import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashMap<Integer , Integer> counts = new HashMap<>();
        for(int i : nums){
            if(counts.get(i) == null){
                counts.put(i , 1);
            }
            else{
                counts.put(i , counts.get(i) + 1);
            }
        }
        for(int j : nums){
            if(counts.get(j) == 1){
               ans = j; 
            }
        }
        return ans;

    }
}