public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(20);
        linkedList.addFirst(60);
        linkedList.addFirst(78);
        linkedList.addLast(45);
        linkedList.addLast(1);
        linkedList.addLast(7);
        System.out.println(linkedList.contains(60));
       System.out.println(linkedList.indexOf(20));

            }


}
