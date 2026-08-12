// Last updated: 8/13/2026, 12:40:58 AM
class Solution {
    public int reverse(int x) {

        long sum = 0;
        int ld = 0;
     while (x > 0 || x < 0){

        ld = x % 10;
        x = x / 10;
        sum = sum * 10 + ld;


     }   
     if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE ){
        return 0;
     }else{

     return (int) sum;
     }
        
    }
}