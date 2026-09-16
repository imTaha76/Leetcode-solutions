// Last updated: 9/17/2026, 1:45:08 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int pivotidx = 0;
5        for(int i = 0 ; i<n ; i++){
6            if( i+1 < n && nums[i] > nums[i+1]){
7               pivotidx = i+1;
8            }
9        }
10        if(pivotidx == 0){
11            if(target == nums[0]){
12                return 0;
13            }
14            
15        }
16        int s;
17        int e;
18        if(pivotidx == 0) {
19         s = 0;
20         e = n-1;
21
22        }
23        else if(target < nums[0]){
24            s = pivotidx;
25            e = n-1;
26        }
27        else{
28           s = 0;
29           e = pivotidx-1; 
30        }
31        while (s <=e){
32            int mid = s + (e-s)/2;
33            if(nums[mid] == target){
34                return mid;
35            }
36            if(nums[mid] < target ){
37                s = mid+1;
38            }
39            else{
40                e = mid-1;
41            }
42           
43        }
44        
45
46    return -1;
47    }
48}