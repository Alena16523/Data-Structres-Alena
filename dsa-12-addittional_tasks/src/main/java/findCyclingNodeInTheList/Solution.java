package findCyclingNodeInTheList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //Given the head of a linked list, return the node where the cycle begins.
        // If there is no cycle, return null. There is a cycle in a linked list if there is some node
        // in the list that can be reached again by continuously following the next pointer.
        // Internally, pos is used to denote the index of the node that tail's next pointer is connected
        // to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
        Node n1=new Node(3);
        Node n2=new Node(2);
        Node n3=new Node(0);
        Node n4=new Node(-4);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n2;

        System.out.println(detectCycle(n1).data);
        System.out.println(detectCycle2(n1).data);
    }

    public static Node detectCycle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break; //intersection node
        }
        if (fast == null || fast.next == null) return null; //no cycle
        while (head != slow) {
            head = head.next; //pointer 1 starts from head
            slow = slow.next; //pointer 2 starts from intersection node
        }
        return head;
    }

    public static Node detectCycle2(Node head){
        Set<Node> visited =new HashSet<>(); // it will not allow duplicates
        Node current=head;
        while(current!=null){
            if(visited.contains(current))return current;
            visited.add(current);
            current=current.next;
        }
      return null;
    }

//    public static int detectCycle(Node head) {
//
//        Node current=head;
//        int pos =-1;
//        HashSet<Node> result=new HashSet<>(); //to remove duplicates
//
//        while(current!=null){
//            if(result.contains(current)) {
//                ArrayList<Node> result2=new ArrayList<>(result);
//                for (int i = 0; i < result2.size(); i++) {
//                    if(result2.get(i).equals(current.data)) return i;
//                }
//            }else{
//                result.add(current);
//                pos++;
//            }
//            current=current.next;
//        }
//    return pos;
//    }

}
