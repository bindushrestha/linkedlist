import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

   // LinkedList linkedList = new LinkedList();
    //addFirst
    //addLast
    //deleteFirst
    //deleteLast
    //contains
    //indexOf


    public void addFirst(int item) {
        Node node = new Node(item);
        if (isEmpty(first)) {
            first = last = node;
        }
//if first not null, copy the first to new node. Set first to new node. Set next of first to new node.
        else {
            Node nextNode;
            nextNode = first;
            node.setNext(nextNode);
            first = node;
        }
    }
public void addLast(int lastItem){
    Node lastNode = new Node(lastItem);
    if(isEmpty(first))
        first = last = lastNode;
else{
    last.setNext(lastNode);
    last = lastNode;

        }
}

public void deleteFirst(){
        if( !isEmpty(first ) ){
            if( first == last){
                first = last = null;
                return;
            }
                var second = first.getNext();
            first.setNext(null);
            first = second;
        }
}

public void deleteLast(){
        if(isEmpty(first))
            throw new NoSuchElementException();

        if(first == last) {
            first = last = null;
            return;
        }
        var previous = getPrevious(last);
        last = previous;
        last.setNext(null);
}

private Node getPrevious(Node node){
      Node current = first;
      while(current != null){
          if(current.getNext() == node) return current;
          current = current.getNext();
      }
      return null;
}

public boolean contains(int item) {
    return indexOf(item) != -1;
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = first;
        while (current != null) {
            if (current.getValue() == item)
                return index;
            current = current.getNext();
            index++;
        }
        return -1;
    }

    private boolean isEmpty(Node node){
        if(node == null)
            return true;
        return false;
    }
}