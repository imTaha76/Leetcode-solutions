// Last updated: 9/24/2026, 6:48:26 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n==1){
4            return true;
5        }
6        int num = 0;
7        int i = 1;
8        while(i>0){
9          if(Math.pow(2,i)==n){
10            return true;
11          }
12          if(n<Math.pow(2,i)){
13            return false;
14          }
15          i++;
16        }
17        return false;
18    }
19}