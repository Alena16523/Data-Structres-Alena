package tasks;


public class Node {

    public Node next;
    public int value;

    public Node(int value) {
        this.value = value;
    }

    public void print() {
        Node current = this;

        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
