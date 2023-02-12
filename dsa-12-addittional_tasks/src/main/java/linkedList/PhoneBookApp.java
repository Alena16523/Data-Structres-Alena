package linkedList;

public class PhoneBookApp {

    Node head;
    Node tail;
    int size;

    public PhoneBookApp() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void insert(String name, String lastName, String email, String phoneNumber){
        // create a new node
        Node node=new Node(name, lastName, email, phoneNumber);
        // if list empty
        if(isEmpty()){
            head=tail=node;
        }
        //not empty
        tail.next=node;
        node=tail;

        //increase size
        size++;
    }

    int size(Node head){
        //create tem variable to iterate
        Node current=head;
        int size=0;
        //iterate and count
        while(current!=null){
            current=current.next;
            size++;
        }
        //return count
        return size;
    }

    int indexOf(String email) {
        //create tem variable to iterate
        Node current=head;
        int index=0;
        //iterate and look for elements data
        while(current!=null){
            if(current.email.equals(email)){
                return index;
            }
            index++;
            current=current.next;
        }
        return -1;
    }

    int finfByName(String name) {
        //create tem variable to iterate
        Node current=head;
        int index=0;
        //iterate and look for elements data
        while(current!=null){
            if(current.email.equals(name)){
                return index;
            }
            index++;
            current=current.next;
        }
        return -1;
    }

    void deleteByEmail(String email){
        Node current=head;
        Node prev =head;

        if(isEmpty()) System.out.println("List is empty");

        while(current!=null){
            if(current.email.equals(email)){
                //head
                if(current==head){
                    current.next=head;
                    current=null;
                }else if(current==tail){
                    tail=prev;
                    prev.next=null;
                }else{
                    prev.next=current.next;
                    current.next=null;
                }
                size--;
            }
            prev=current;
            current=current.next;
        }
    }

    void swapData(Node node1, Node node2){ //swapping data, not nodes

        Node temp=new Node(node2.name,node2.lastName,node2.email,node2.phoneNumber);
        node2.name=node1.name;
        node2.lastName=node1.lastName;
        node2.email=node1.email;
        node2.phoneNumber=node1.phoneNumber;

        node2.name=node1.name;
        node2.lastName=node1.lastName;
        node2.email=node1.email;
        node2.phoneNumber=node1.phoneNumber;

    }

    void sortByName(){
        Node current=head;
        Node current2;

        if(current.next!=null){
            current2=current.next;
        }else return;

        boolean swap=true;

        while(swap==true){
           swap=false;
           current=head;
           current2=current.next;
           while(current!=null && current2!=null){

               if(current.name.compareToIgnoreCase(current2.name)>0){
                   swapData(current, current2);
                   swap=true;
               }
               current=current.next;
               current2=current2.next;
           }

        }

    }




}
