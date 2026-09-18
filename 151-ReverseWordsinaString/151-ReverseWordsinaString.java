// Last updated: 9/19/2026, 12:46:43 AM
1class Solution {
2    public String reverseWords(String s) {
3        StringBuilder ans = new StringBuilder();
4        int i = s.length() - 1;
5
6        while(i >= 0){
7            while (i>=0 && s.charAt(i)==' '){
8                i--;
9            }
10            if(i<0){
11                break;
12            }
13            int j = i;
14            while(j>=0 && s.charAt(j) != ' '){
15                j--;
16            }
17            ans.append(s.substring(j+1 , i+1));
18
19            while(j>=0 && s.charAt(j) == ' '){
20                j--;
21            }
22
23            if(j>=0){
24                ans.append(' ');
25            }
26
27            i=j;
28        }
29    return ans.toString();
30    }
31}