public class MyLinkedList<E> {
    private Node head;
    protected int size = 0;

    public MyLinkedList() {
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node<E>(element);
        head.next = temp;

        size++;
    }

    public void addLast (E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node<E>(element);
        size++;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node<E>(element);
        temp.next.next = holder;

        size++;
    }

    public E remote(int index) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index -1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = temp.next.next;
        size--;
        return (E) holder.data;
    }

    public boolean constant (E element) {
        boolean constant = false;
        Node temp = head;
        while (temp != null) {
            if (temp.data == element) {
                constant = true;
                break;
            }
            temp = temp.next;
        }
        return constant;
    }

    public int indexOf(E element) {
        int indexOf = -1;
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == element) {
                indexOf = i;
                break;
            }
            temp = temp.next;
        }
        return indexOf;
    }

    public E get(int index) {
        Node temp = head;
        if (index < 0 || index < size -1){
            System.out.println("Out of range");
            return null;
        } else {
            for (int i = 0; i < index ; i++) {
                temp = temp.next;
            }
        }
        return (E) temp.data;
    }

    public E getFirst() {
        return (E) head.data;
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public MyLinkedList clone() {
        return this;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%-5d", temp.data);
            temp = temp.next;
        }
    }
}
