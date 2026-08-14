// Last updated: 8/14/2026, 6:40:44 PM
1import java.util.Arrays;
2class Solution {
3    public int sumOfMultiples(int n) {
4        int sum = 0;
5        if(n<105){
6           for(int i = 0; i<=n; i++){
7            if(i%3 == 0 || i%5 == 0 || i%7 == 0){
8                sum = sum + i;
9            }
10           }
11        }
12        else{
13            for(int i = 0; i <=n;i++){
14                if(i%105 == 0){
15                    sum = sum + i;
16                }
17                else{
18                    if(i%3 == 0 || i%5 == 0 || i%7 == 0){
19                sum = sum + i;
20            }
21                }
22            }
23        }
24
25        return sum;
26
27    }
28}