// Last updated: 9/19/2026, 10:56:12 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        if(haystack.contains(needle)){
4        return haystack.indexOf(needle);
5        }
6        else{
7            return -1;
8        }
9    }
10}