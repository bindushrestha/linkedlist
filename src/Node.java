public class Node {
    private int value;
    private Node next;

    public Node(int item) {
        this.value = item;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
     public Node getNext(){
        return next;
     }
}
