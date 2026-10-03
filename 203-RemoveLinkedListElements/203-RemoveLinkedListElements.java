// Last updated: 10/3/2026, 11:11:01 PM
1class Solution {
2    public ListNode removeElements(ListNode head, int val) {
3
4        if (head == null) {
5            return null;
6        }
7
8        // Remove matching nodes from the beginning
9        while (head != null && head.val == val) {
10            head = head.next;
11        }
12
13        // Everything was removed
14        if (head == null) {
15            return null;
16        }
17
18        ListNode ans = head;
19        ListNode prev = head;
20        ListNode curr = head.next;
21
22        while (curr != null) {
23
24            if (curr.val == val) {
25                // Remove curr
26                prev.next = curr.next;
27            } else {
28                // Move prev only when curr is NOT removed
29                prev = curr;
30            }
31
32            curr = curr.next;
33        }
34
35        return ans;
36    }
37}