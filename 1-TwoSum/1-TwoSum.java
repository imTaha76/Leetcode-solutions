// Last updated: 11/19/2026, 12:23:47 PM
1public class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int[] arr = new int[2];
4        for(int i = 0 ; i < nums.length ; i++ ){
5            for(int j = 1 ; j <= nums.length-1 ; j++){
6                if(i!=j){
7                    if( nums[i] + nums[j] == target){
8                        arr[0] = i;    
9                        arr[1] = j;    
10                    }
11                    
12                }
13                
14            }
15        }
16        return arr;
17    }
18}