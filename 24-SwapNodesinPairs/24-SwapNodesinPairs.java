// Last updated: 10/9/2026, 11:47:05 PM
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
11
12class Solution {
13    public ListNode swapPairs(ListNode head) {
14        ListNode temp = head;
15        int size = 0;
16
17        while (temp != null) {
18            size++;
19            temp = temp.next;
20        }
21
22        int noOfpairsswap = size / 2;
23
24        ListNode dummy = new ListNode(0);
25        dummy.next = head;
26
27        ListNode prev = dummy;
28        ListNode Temp = head;
29
30        for (int i = 0; i < noOfpairsswap; i++) {
31            ListNode nextNode = Temp.next;
32
33            // Swap the pair
34            Temp.next = nextNode.next;
35            nextNode.next = Temp;
36            prev.next = nextNode;
37
38            // Move to the next pair
39            prev = Temp;
40            Temp = Temp.next;
41        }
42
43        return dummy.next;
44    }
45}
46