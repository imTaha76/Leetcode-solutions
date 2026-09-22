// Last updated: 9/22/2026, 5:42:07 PM
1class Solution {
2    public String removeDuplicates(String s) {
3      int n = s.length();
4      if(n==1){
5        return s;
6      }
7      int i = 0;
8       StringBuilder sb = new StringBuilder(s);
9       StringBuilder result = new StringBuilder();
10       while(i<n){
11        if(result.length()!=0 && sb.charAt(i) == result.charAt(result.length()-1)){
12           result.delete(result.length()-1 , result.length());
13           i++;
14           
15        }else{
16        result.append(sb.charAt(i));
17        i++;
18        }
19       }
20    return result.toString();
21    }
22}