// Last updated: 10/6/2026, 3:03:11 AM
1class Solution {
2    static double slope(int[] p1 , int[] p2 ){
3        if(p1[0] - p2[0] == 0){
4            return 23.0;
5        }
6        double s = (double)(p2[1] - p1[1]) / (p2[0] - p1[0]);
7        return s;
8    }
9    public boolean checkStraightLine(int[][] coordinates) {
10       
11        boolean ans = false;
12        int i = 0;
13        int j = coordinates.length-1;
14        if(j+1 <=2){
15            return true;
16        }
17        
18
19        while((i+2) <= j){
20            if(slope(coordinates[i] , coordinates[i+1]) == slope(coordinates[i+1] , coordinates[i+2])){
21                ans = true;
22                i++;
23                
24
25            }
26            else{
27                return false;
28            }
29        }
30        return ans;
31
32    }
33}