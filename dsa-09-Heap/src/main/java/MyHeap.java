import java.util.NoSuchElementException;

public class MyHeap {

    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size=0;
    }

    public int peek() { //shows the root , as index 0 is the root
        if (size==0) throw new NoSuchElementException();
        return items[0];
    }

    public void insert(int value) {
        if(size==items.length) throw new IllegalStateException(); //if array is full
        else {
           items[size++]=value;
           bubbleUp(); //if element is inserted, we need to check heap properties.
        }
    }

    public void bubbleUp(){
        //calculate start point (index of the last inserted element)
        int index=size-1;
        // while index >0 %% parent is less than child-> continue...
        // 1. swap child and parent
        // calculate next index = parent index
        while (index>0 && items[index]>items[parentIndex(index)]){
            //swapping child with parent
            swap (index, parentIndex(index));
            // assign index with the parent index
            index=parentIndex(index);//like current=current.next
        }
    }

    public int remove(){
        if (size==0) throw new NoSuchElementException();
        else {
            int result= items[0];
            items[0]=items[--size]; //placing last element to the index[0], as it is removed
            bubbleDown();
            return result;
        }
    }
    public void bubbleDown(){
        int index=0;
        int largerChildIndex;
        while (index<=size && !isValidParent(index)){
            largerChildIndex=largerChildIndex(index);
            swap(index, largerChildIndex);
            index=largerChildIndex;
        }
    }
    public boolean isValidParent(int index){
        //we are checking left child, as it is complete tree, and if it has no left child, therefor no right child exist
        //therefore this node is not a parent node
        if (!hasLeftChild(index)) return true;
        else {
            boolean isValid=(items[index]>=items[leftChildIndex(index)]);
            if (hasRightChild(index)) {
                isValid= (items[index]>=items[leftChildIndex(index)]&&items[index]>=items[rightChildIndex(index)]);
            }
            return isValid;
        }
    }

    public void swap(int first, int second){
        int temp=items[first];
        items[first]=items[second];
        items[second]=temp;
    }
    public int parentIndex(int index) { return (index-1)/2;}
    public boolean hasLeftChild(int index){ return  leftChildIndex(index)<=size;}
    public boolean hasRightChild(int index){ return  rightChildIndex(index)<=size;}
    public int leftChildIndex(int index){ return index*2 +1;}
    public int rightChildIndex(int index){ return index*2 +2;}
    public int largerChildIndex(int index) {
        if (!hasLeftChild(index)) return index;
        else if (!hasRightChild(index)) {
            return leftChildIndex(index);
        }
        return items[leftChildIndex(index)]>items[rightChildIndex(index)] ? leftChildIndex(index):rightChildIndex(index);
    }

    public void printHeap(){
        for (int i = 0; i < size; i++) {
            System.out.print(items[i]+ ", ");
        }
        System.out.println();
    }





}
