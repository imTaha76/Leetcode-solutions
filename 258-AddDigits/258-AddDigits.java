// Last updated: 9/24/2026, 7:10:46 PM
1class Solution {
2    public int addDigits(int num) {
3        int result = 0;
4        while(num!=0){
5            int rem = num%10;
6            result += rem;
7            num /=10;
8        }
9        if(result/10==0){
10            return result;
11        }
12        return addDigits(result);
13        
14    }
15}