// Last updated: 9/23/2026, 11:58:20 PM
1class Solution {
2    static int factorial(int num){
3        if(num==0){
4            return 1;
5        }
6        return num * factorial(num-1);
7    }
8    static String recursion(int rem , int dividend , int n,List<Integer> list,StringBuilder ans){
9        ans.append(String.valueOf(list.get(dividend)));
10        list.remove(dividend);
11        int new_n = list.size();
12        if(list.size()==0){
13            return ans.toString();
14        }
15        int new_dividend = rem / factorial(list.size()-1);
16        int new_rem = rem % factorial(list.size()-1);
17        return recursion(new_rem , new_dividend , new_n, list,ans);
18
19
20        
21
22    }
23    public String getPermutation(int n, int k) {
24        
25        List<Integer> list = new ArrayList<>();
26        StringBuilder ans = new StringBuilder();
27        for(int i = 1; i<=n;i++){
28           list.add(i);
29        }
30        
31        int dividend = (k-1) / factorial(n-1);
32        int rem = (k-1) % factorial(n-1);
33        n = n-1;
34        String result = recursion(rem,dividend,n, list,ans);
35        return result; 
36        }
37}