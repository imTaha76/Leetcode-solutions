// Last updated: 10/19/2026, 12:29:10 AM
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
12    //reversing a LL
13    public static ListNode reverse(ListNode head){
14        ListNode prev = null;
15        ListNode curr = head;
16        while(curr!=null){
17            ListNode forward = curr.next;
18            curr.next = prev;
19            prev = curr;
20            curr = forward;
21        }
22        return prev;
23    }
24
25    public ListNode doubleIt(ListNode head) {
26        //1.Reversing the LL
27        head = reverse(head);
28
29        //2. Doubling the number
30        ListNode temp = head;
31        ListNode prev = null;
32        int carry = 0;
33        while(temp!=null){
34            int sum = temp.val + temp.val + carry;
35            int digit = sum%10;
36            temp.val = digit;
37            carry = sum/10;
38            prev = temp;
39            temp = temp.next;
40            
41        }
42        if(temp == null && carry!=0){
43            prev.next = new ListNode(carry);
44        }
45
46        //3. Reversing the LL
47        head = reverse(head);
48        return head;
49
50
51    }
52}