// Last updated: 8/17/2026, 7:19:43 PM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        //Step -1 Transpose
6        for(int row = 0; row<n;row++){
7            for(int col = row+1; col<n;col++){
8                int temp = matrix[row][col];
9                matrix[row][col] = matrix[col][row];
10                matrix[col][row] = temp;
11            }
12        }
13
14        //Step-2 Reverse the rows
15        for(int i = 0; i < n;i++){
16            int startcol = 0;
17            int endcol = n-1;
18            while(startcol<=endcol){
19                int temp = matrix[i][startcol];
20                matrix[i][startcol] = matrix[i][endcol];
21                matrix[i][endcol] = temp;
22                startcol++;
23                endcol--;
24            }
25        }
26        System.out.print(matrix);
27    }
28}