// Last updated: 9/25/2026, 11:58:59 PM
1class Solution {
2    public boolean isUgly(int n) {
3        if(n<=0){
4            return false;
5        }
6        while(n%2 == 0 || n%3 == 0 || n%5 == 0){
7            if(n%2==0){
8                n = n/2;
9            }
10            if(n%3==0){
11                n = n/3;
12            }
13            if(n%5==0){
14                n = n/5;
15            }
16
17        }
18        if(n == 1){
19            return true;
20        }
21        else{
22            return false;
23        }
24        
25
26    }
27}