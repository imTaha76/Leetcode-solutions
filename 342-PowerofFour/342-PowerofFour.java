// Last updated: 9/26/2026, 2:09:20 PM
1class Solution {
2    static boolean recursion(int i ,int num ,double compare){
3        if(num == Math.pow(4,i)){
4            return true;
5        }
6        compare = Math.pow(4,i);
7        if(num<compare){
8            return false;
9        }
10        i++;
11        return recursion(i,num,compare);
12
13    }
14    public boolean isPowerOfFour(int n) {
15        if(n<=0){
16            return false;
17        }
18        double compare = 0;
19        int i = 0;
20        compare = Math.pow(4,i);
21        i++;
22        if(n==compare){
23            return true;
24        }
25        if(n<compare){
26            return false;
27        }
28        return recursion(i,n,compare);
29    }
30}