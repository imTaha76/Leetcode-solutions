// Last updated: 9/21/2026, 12:31:27 PM
1class Solution {
2    public String reverseVowels(String s) {
3        StringBuilder sb = new StringBuilder();
4        int i = s.length()-1;
5        while(i>=0){
6            if (Character.toLowerCase(s.charAt(i)) == 'a' || 
7    Character.toLowerCase(s.charAt(i)) == 'e' || 
8    Character.toLowerCase(s.charAt(i)) == 'i' || 
9    Character.toLowerCase(s.charAt(i)) == 'o' || 
10    Character.toLowerCase(s.charAt(i)) == 'u'){
11                sb.append(s.charAt(i));
12            }
13            i--;
14        }
15
16        //now sb contains a string of all the vowels present in String s
17
18        sb = sb.reverse();
19
20        StringBuilder result = new StringBuilder(s);
21        int j = s.length() - 1;
22
23       int k = 0;
24
25while (j >= 0) {
26
27    if (Character.toLowerCase(s.charAt(j)) == 'a' ||
28        Character.toLowerCase(s.charAt(j)) == 'e' ||
29        Character.toLowerCase(s.charAt(j)) == 'i' ||
30        Character.toLowerCase(s.charAt(j)) == 'o' ||
31        Character.toLowerCase(s.charAt(j)) == 'u') {
32
33        result.setCharAt(j, sb.charAt(k));
34        k++;
35    }
36
37    j--;
38}
39        return result.toString();
40    }
41}