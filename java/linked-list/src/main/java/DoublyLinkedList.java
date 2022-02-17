public class DoublyLinkedList<T> {
    
    Node head, tail = null;

    class Node {
        private T e;
        private Node next;
        private Node prev;

        public Node(T o) {
            this.e = o;
        }

        public T getElement() {
            return e;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrev() {
            return prev;
        }
     
    }
    
    public DoublyLinkedList() {
        super();
    }
    
    /**
     * Insert value e at back
     * @param e
     */

    public void push(T e) {
        Node newNode = new Node(e);
        if(head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    /**
     * Remove the value at back
     * @return the value removed
     */

    public T pop() {
        Node oldTail = tail;
        if(tail == head) {
            head = null;
            tail = null;
        }
        else {
            tail = oldTail.prev;
            tail.next = null;
        }
        return oldTail.getElement();
    }

    /**
     * Remove the value at front
     * @return the value removed
     */

    public T shift() {
        Node oldHead = head;
        if(head == tail) {
            head = null;
            tail = null;
        }
        else {
            head = oldHead.next;
            head.prev = null;
        }
        return oldHead.getElement();
    }

    /**
     * Insert value at front
     * @param e
     */

    public void unshift(T e) {
        Node newNode = new Node(e);
        if(head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

}