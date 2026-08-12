// Last updated: 8/13/2026, 12:40:57 AM
class Solution {
    public boolean isPalindrome(int x) {
        
        int dup = x;
        int ld , sum = 0;
        while (x>0) {
            ld = x % 10;
            x = x / 10;
            sum = sum*10 + ld; 
        }

        if (dup == sum){
            return true;
        } else {
            return false;
        }

    
    }
}