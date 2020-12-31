public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        myList.addFirst(4);
        myList.addFirst(3);
        myList.addFirst(2);
        myList.addFirst(1);
        myList.addLast(5);
        myList.remote(3);
        myList.printList();
        System.out.println("\nSize: " + myList.size);
        System.out.println(myList.constant(6));
        System.out.println(myList.constant(5));
        System.out.println(myList.indexOf(6));
        System.out.println(myList.indexOf(5));
        System.out.println(myList.get(3));
        System.out.println("First element is: " + myList.getFirst());
        System.out.println("Last element is: " + myList.getLast());
        myList.clear();
        myList.printList();
    }
}
