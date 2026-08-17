// Last updated: 8/17/2026, 6:38:20 PM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        int[][] result = new int[n][m];
6
7        for(int row = 0; row<m;row++){
8            for (int col = 0; col < n; col++){
9                result[col][row] = matrix[row][col];
10            }
11        }
12        return result;
13        
14    }
15}