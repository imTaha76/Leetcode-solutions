// Last updated: 9/17/2026, 11:24:03 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6
7        int s = 0;
8        int e = m*n - 1;
9
10        while(s<=e){
11            int mid = s + (e-s)/2;
12            int rowidx = mid/n;
13            int colidx = mid % n;
14
15            if(matrix[rowidx][colidx] == target){
16                return true;
17            }
18            if(matrix[rowidx][colidx] > target){
19                e = mid - 1;
20            }
21            else{
22                s = mid + 1;
23            }
24        }
25
26
27
28    return false;
29    }
30}