// Last updated: 8/17/2026, 7:19:11 PM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        for(int row = 0; row<n;row++){
6            for(int col = row+1; col<n;col++){
7                int temp = matrix[row][col];
8                matrix[row][col] = matrix[col][row];
9                matrix[col][row] = temp;
10            }
11        }
12
13        //Step-2 Reverse the rows
14        for(int i = 0; i < n;i++){
15            int startcol = 0;
16            int endcol = n-1;
17            while(startcol<=endcol){
18                int temp = matrix[i][startcol];
19                matrix[i][startcol] = matrix[i][endcol];
20                matrix[i][endcol] = temp;
21                startcol++;
22                endcol--;
23            }
24        }
25        System.out.print(matrix);
26    }
27}