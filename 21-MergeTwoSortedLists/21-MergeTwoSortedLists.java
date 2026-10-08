// Last updated: 10/9/2026, 12:01:53 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode temp1 = list1;
14        ListNode temp2 = list2;
15        ListNode dummy = new ListNode(-1);
16        ListNode dum = dummy;
17
18        while(temp1!=null || temp2!=null){
19            if(temp1 == null || temp2 == null){
20                    break;
21            }
22            if(temp1.val>temp2.val){
23                dum.next = temp2;
24                dum = dum.next;
25                
26                temp2 = temp2.next;
27            }
28            else{
29                dum.next = temp1;
30                dum = dum.next;
31                if(temp1 == null || temp2 == null){
32                    break;
33                }
34                temp1 = temp1.next;
35                
36            }
37        }
38        dum.next = (temp1 != null ? temp1 : temp2);
39        dummy = dummy.next;
40        return dummy;
41    }
42}