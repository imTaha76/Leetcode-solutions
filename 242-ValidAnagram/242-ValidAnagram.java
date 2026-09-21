// Last updated: 9/21/2026, 10:17:36 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        if (s.length() != t.length()) {
5            return false;
6        }
7
8        StringBuilder str = new StringBuilder(t);
9
10        for (int i = 0; i < s.length(); i++) {
11
12            int index = str.indexOf(
13                String.valueOf(s.charAt(i))
14            );
15
16            if (index == -1) {
17                return false;
18            }
19
20            str.deleteCharAt(index);
21        }
22
23        return str.length() == 0;
24    }
25}