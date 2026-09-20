// Last updated: 9/20/2026, 11:37:41 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3      StringBuilder sb = new StringBuilder();
4      int i = s.length()-1;
5      while(i>=0){
6        if(Character.isLetterOrDigit(s.charAt(i)))
7             sb.append(Character.toLowerCase(s.charAt(i)));
8            i--;
9      }
10      String original = sb.toString();
11      String reversed = sb.reverse().toString();
12      if(reversed.equals(original)){
13        return true;
14      }
15      else{
16        return false;
17      }  
18    }
19}