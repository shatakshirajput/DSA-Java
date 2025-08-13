//ASSIGNMENT - LINKED LIST

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class asgnmt18 {
    public static int getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return 0;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a.val; 
    }

    public static void main(String[] args){
    // Ques -> Intersection of Two Linked Lists
    // In a system there are two singly linked list.By some programming error, the end node of one of the linked lists got linked to the second list, forming an invertedY - shapedlist .Write a program to get the point where two linked lists merge. 
    ListNode common = new ListNode(6);
    common.next = new ListNode(7);

    // First List: 1 → 2 → 3 →[6 → 7]
    ListNode headA = new ListNode(1);
    headA.next = new ListNode(2);
    headA.next.next = new ListNode(3);
    headA.next.next.next = common;

    // Second List: 4 → 5 → [6 → 7]
    ListNode headB = new ListNode(4);
    headB.next = new ListNode(5);
    headB.next.next = common;

    System.out.println("   "+ getIntersectionNode(headA,headB));
    }
}