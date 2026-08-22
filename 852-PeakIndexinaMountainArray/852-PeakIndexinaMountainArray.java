// Last updated: 8/22/2026, 11:48:58 PM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int n = arr.length;
4        int start = 0;
5        int end = n-1;
6        int ans = 0;
7
8        while(start <= end){
9            int mid = (start + end) / 2;
10            if(arr[mid] < arr[mid + 1]){
11               
12               start = mid + 1;
13            }
14            if(arr[mid] >= arr[mid + 1]){
15                ans = mid;
16                end = mid - 1;
17            }
18
19
20        }
21        return ans;
22    }
23}