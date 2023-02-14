package middleLinkedList;

public class MySinglyLinkedList {
   public Node head;
    public Node tail;
   public int size;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        // create a new node object from data
        Node node = new Node(data);

        if (isEmpty()) { // if the list is empty
            head = tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }
    }

    int size(){
        Node current=head;
        int size=0;
        while(current!=null){
            current=current.next;
            size++;
        }
        return size;
    }

}