package middleLinkedList;

public class MiddleOfLinkedList {

    public static void main(String[] args) {

        MySinglyLinkedList numbers=new MySinglyLinkedList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

//       findMiddle(numbers, Node head);

    }

  public static Node findMiddle (MySinglyLinkedList numbers, Node head){
        Node current = head;
        int middle= (numbers.size())/2;
        int counter=0;

        if(numbers.isEmpty()){
            System.out.println("List is empty");
        }

        if(current.next==null){
            return current;
        }

        while(current!=null){
            if(counter==middle){
                return current;
            }else{
                current=current.next;
                counter++;
            }
        }

      return current;
  }

}


