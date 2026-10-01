// Last updated: 10/1/2026, 11:05:46 PM
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
12    public boolean isPalindrome(ListNode head) {
13        StringBuilder str = new StringBuilder();
14        ListNode curr = head;
15        while(curr != null){
16            str.append(String.valueOf(curr.val));
17            curr = curr.next;
18        }
19        String original = str.toString();
20        if(original.equals(str.reverse().toString())){
21            return true;
22        }
23        else{
24            return false;
25        }
26    }
27}