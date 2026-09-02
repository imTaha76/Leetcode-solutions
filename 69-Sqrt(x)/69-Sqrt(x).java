// Last updated: 9/3/2026, 1:25:25 AM
1class Solution {
2    public int mySqrt(int x) {
3        
4       if(x == 1){
5        return 1;
6       }
7       if(x == 0){
8        return 0;
9       }
10       int ans = 0;
11
12       int start = 1;
13       int end = x/2;
14       while (start <= end){
15        int mid = start + (end - start)/2;
16        if(mid == x/mid){
17         return mid;
18        }
19        if(mid  > x/mid){
20            end = mid - 1;
21        }
22        if(mid < x/mid){
23            ans = mid;
24            start = mid + 1;
25        }
26       }
27       return ans;
28    }
29}