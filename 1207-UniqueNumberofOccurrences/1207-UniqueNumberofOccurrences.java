// Last updated: 8/19/2026, 6:55:25 PM
1class Solution {
2    public boolean uniqueOccurrences(int[] arr) {
3        int n = arr.length;
4        boolean result = false;
5        HashMap<Integer , Integer> count = new HashMap<>();
6        for(int i = 0; i < n ; i++){
7            if(count.get(arr[i]) == null){
8                count.put(arr[i] , 1);
9            }
10            else{
11                count.put(arr[i] , count.get(arr[i])+ 1);
12            }
13        }
14        ArrayList<Integer> values = new ArrayList<>(count.values());
15        HashSet<Integer> set = new HashSet<>();
16        for(int num : values){
17            if(set.contains(num)){
18                return false;
19            }
20             set.add(num);
21
22        }
23        //     if(values.size() == 1){
24        //         return true;
25        //         ;
26        //     }
27        // for(int j = 0; j < values.size()-1; j++){
28        //     if(values.get(j) == values.get(j+1)){
29        //         result = false;
30        //     }
31        //     else{
32        //         result = true;
33        //     }
34        // }
35           return true;
36    }
37}