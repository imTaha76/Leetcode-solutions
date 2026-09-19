// Last updated: 9/19/2026, 11:35:47 PM
1class Solution {
2    public String addBinary(String a, String b) {
3        int lena = a.length();
4        int lenb = b.length();
5        StringBuilder sb = new StringBuilder();
6
7        int i = a.length()-1;
8        int j = b.length()-1;
9        int carry = 0;
10
11        while(i>=0 || j>=0 || carry>0){
12         int sum = carry;
13         if(i>=0){
14          sum += a.charAt(i) - '0';
15          i--;
16          }
17          if(j>=0){
18            sum += b.charAt(j) - '0';
19            j--;
20          }
21
22         sb.append(sum % 2);
23         carry = sum/2;
24        }
25
26        return sb.reverse().toString();
27
28    }
29}