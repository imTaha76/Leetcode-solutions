// Last updated: 9/19/2026, 11:02:29 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        String str = s.strip();
4        int i = str.length()-1;
5        int counter = 0;
6
7        while(i>=0 && str.charAt(i)!=' '){
8            counter++;
9            i--;
10        }
11        return counter;
12    }
13}