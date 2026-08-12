// Last updated: 8/13/2026, 12:40:42 AM
class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] ans = new char[n];
        for(int i=0; i<n/2 ; i++){

        
            char temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
        }
        System.out.print(s);
    }
}