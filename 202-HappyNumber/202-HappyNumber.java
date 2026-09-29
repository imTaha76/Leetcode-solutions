// Last updated: 9/30/2026, 12:32:31 AM
1class Solution {
2    static boolean recursion(int n) {
3        if (n == 1) {
4            return true;
5        }
6
7        if (n == 4) {
8            return false;
9        }
10
11        int res = 0;
12
13        while (n > 0) {
14            int num = n % 10;
15            res += num * num;
16            n /= 10;
17        }
18
19        return recursion(res);
20    }
21
22    public boolean isHappy(int n) {
23        return recursion(n);
24    }
25}