package ExtraTasks;

import MergeTwoSortedLL.ListNode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedList {
    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode nodeA1 = new ListNode(1);

        ListNode headB = new ListNode(5);
        ListNode nodeB1 = new ListNode(6);
        ListNode nodeB2 = new ListNode(1);

        ListNode nodeCommon1 = new ListNode(8);
        ListNode nodeCommon2 = new ListNode(4);
        ListNode nodeCommon3 = new ListNode(5);
        nodeCommon1.next = nodeCommon2;
        nodeCommon2.next = nodeCommon3;

        headA.next = nodeA1;
        nodeA1.next = nodeCommon1;

        headB.next = nodeB1;
        nodeB1.next = nodeB2;
        nodeB2.next = nodeCommon1;

        ListNode result = getIntersectionNodeWithoutAdditionalSpace(headA, headB);

        while (result != null) {
            System.out.println(result);
            result = result.next;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        Set<ListNode> setNodes = new HashSet<>();
        ListNode currentA = headA;
        ListNode currentB = headB;

        while (currentA != null) {
            setNodes.add(currentA);
            currentA = currentA.next;
        }

        while (currentB != null) {
            if (setNodes.contains(currentB)) {
                return currentB;
            }
            currentB = currentB.next;
        }
        return null;
    }

    public static ListNode getIntersectionNodeWithoutAdditionalSpace(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int sizeA = getSize(headA), sizeB = getSize(headB);
        ListNode currentA = headA, currentB = headB;

        if (sizeA >= sizeB) { //making the size of the linked lists even
            int diff = sizeA - sizeB;
            for (int i = 1; i <= diff; i++) {
                currentA = currentA.next;
            }
        } else {
            int diff = sizeB - sizeA;
            for (int i = 1; i <= diff; i++) {
                currentB = currentB.next;
            }
        }

        while (currentA != null && currentB != null) {
            if (currentA == currentB) {
                return currentA;
            }
            currentA = currentA.next;
            currentB = currentB.next;
        }
        return null;
    }

    public static int getSize(ListNode head) {
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}