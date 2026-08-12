// Last updated: 8/13/2026, 12:40:46 AM
import java.util.Arrays;
class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] answer = new int[nums.length]; 
      int leftproduct = 1;
      int rightproduct = 1;

      for(int i = 0;i < nums.length;i++){
        answer[i] = leftproduct;
        leftproduct = leftproduct * nums[i];
      }

         for(int i =  nums.length - 1 ; i>=0 ; i--){
            answer[i] = answer[i] * rightproduct;
            rightproduct = rightproduct * nums[i];

         } 

         return answer;  
        } 
      
}