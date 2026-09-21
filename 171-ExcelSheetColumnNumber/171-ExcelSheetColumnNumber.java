// Last updated: 9/21/2026, 11:58:31 AM
1class Solution {
2    public int titleToNumber(String columnTitle) {
3        String cleanLetter = columnTitle.toUpperCase();
4
5        int result = 0;
6        for (int i = 0; i < cleanLetter.length(); i++){
7            result = result * 26;
8            result = result + cleanLetter.charAt(i) - 'A' + 1;
9        }
10        return result;
11    }
12}