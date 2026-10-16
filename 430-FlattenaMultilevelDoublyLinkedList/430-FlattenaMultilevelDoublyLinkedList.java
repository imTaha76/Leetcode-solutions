// Last updated: 10/16/2026, 7:25:54 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node prev;
6    public Node next;
7    public Node child;
8};
9*/
10
11class Solution {
12    static Node solve(Node head , Node parent , Node child){
13        Node next = parent.next;
14        parent.next = parent.child;
15        Node kid = parent.child;
16        child.prev = parent;
17        parent.child = null;
18        while(child!=null){
19            if(child.child!=null){
20                Node kiddo = child.child;
21                solve(head , child , kiddo);
22                child = child.next;
23            }
24            else{
25                if(child.next!=null){
26                child = child.next;
27                }
28                else{
29                    child.next = next;
30                    if (next != null) {
31                        next.prev = child;
32                    }
33                        break;
34                }
35            }
36        }
37        return head;
38    }
39
40    public Node flatten(Node head) {
41       if(head == null){
42        return head;
43       } 
44       Node temp = head;
45       while(temp!=null){
46        if(temp.child!=null){
47            Node kid = temp.child;
48            return solve(head , temp , kid);
49        }
50        else{
51            temp = temp.next;
52        }
53       }
54       return head;
55    }
56}