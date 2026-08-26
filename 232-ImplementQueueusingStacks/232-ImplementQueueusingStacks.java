// Last updated: 8/27/2026, 1:11:42 AM
1class MyQueue {
2        Stack<Integer> stack1;
3        Stack<Integer> stack2;
4
5    public MyQueue() {
6       stack1 = new Stack<Integer>();
7        stack2 = new Stack<Integer>();
8    }
9    
10    public void push(int x) {
11        stack1.push(x);
12    }
13    
14    public int pop() {
15        if(stack2.empty()){
16            while(!stack1.empty()){
17                stack2.push(stack1.pop());
18            }
19
20        }
21        return stack2.pop();
22    }
23    
24    public int peek() {
25        if (stack2.empty()) {
26            while (!stack1.empty()) {
27                stack2.push(stack1.pop());
28            }
29        }
30
31        return stack2.peek();
32        
33    }
34    
35    public boolean empty() {
36        return stack1.empty() && stack2.empty(); 
37    }
38}
39
40/**
41 * Your MyQueue object will be instantiated and called as such:
42 * MyQueue obj = new MyQueue();
43 * obj.push(x);
44 * int param_2 = obj.pop();
45 * int param_3 = obj.peek();
46 * boolean param_4 = obj.empty();
47 */