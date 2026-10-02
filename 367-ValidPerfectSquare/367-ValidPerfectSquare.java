// Last updated: 10/2/2026, 11:04:00 PM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        if(num == 1){
4            return true;
5        }
6        int start = 0;
7        int end = num/2;
8
9        while(start<=end){
10            int mid = start + (end-start)/2;
11            if(mid == num / mid && num % mid == 0){
12                return true;
13            }
14            if(mid < num/mid ){
15                start = mid +1 ;
16            }
17            else{
18                end = mid - 1;
19            }
20        }
21        return false;
22    }
23}