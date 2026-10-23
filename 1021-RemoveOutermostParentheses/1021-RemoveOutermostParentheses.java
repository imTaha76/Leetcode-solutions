// Last updated: 10/24/2026, 12:53:54 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3         StringBuilder sb = new StringBuilder("");
4        Deque<Character> st = new ArrayDeque<>();
5
6       for (char c : s.toCharArray()) {
7            if (c == '(') {
8                if (!st.isEmpty()) {
9                    sb.append(c);
10                }
11                st.push(c);
12            } else {
13                st.pop();
14                if (!st.isEmpty()) {
15                    sb.append(c);
16                }
17            }
18        }
19
20        return sb.toString();
21    }
22}