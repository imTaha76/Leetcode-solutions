// Last updated: 10/22/2026, 1:19:56 AM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Deque<Character> st = new ArrayDeque<>();
4        Deque<Character> ts = new ArrayDeque<>();
5
6        for(char i : s.toCharArray()){
7            if(i == '#' && st.size()>=1){
8                st.pop();
9            }
10            if(i!='#'){
11
12                st.push(i);
13            }
14        }
15        for(char k : t.toCharArray()){
16            if(k == '#' && ts.size()>=1){
17                ts.pop();
18            }
19            if(k!= '#'){
20
21                ts.push(k);
22            }
23        }
24        if(st.size() != ts.size()){
25            return false;
26        }
27        int len = st.size();
28        for(int j = 0; j<len;j++){
29            if(st.peek() == ts.peek()){
30                st.pop();
31                ts.pop();
32            }
33            else{
34                return false;
35            }
36        }
37        return true;
38    }
39}