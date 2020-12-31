public class Node<E> {
    protected E data;
    protected Node next;

    public Node(E data) {
        this.data = data;
        this.next = null;
    }

    // Getters

    public E getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    // Setters

    public void setData(E data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
