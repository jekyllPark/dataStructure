package _1003;

public class DoubleLinkedList<T> {
    Node<T> head = null;
    Node<T> tail = null;

    public class Node<T> {
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if(this.head == null) {
            this.head = new Node<>(data);
            this.tail = this.head;
        } else {
            Node<T> node = this.head;
            while(node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public void printAll () {
        if(this.head == null) {
            System.out.println("No data");
        } else {
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public T searchFromHead(T isData) {
        if(this.head == null) return null;
        Node<T> node = this.head;
        while(node != null) {
            if(node.data == isData) {
                return node.data;
            } else {
                node = node.next;
            }
        }
        return null;
    }

    public T searchFromTail(T isData) {
        Node<T> node = this.tail;
        while (node != null) {
            if(node.data == isData) {
                return node.data;
            } else {
                node = node.prev;
            }
        }
        return null;
    }

    public boolean insertToFront(T existData, T addData) {
        if(this.head == null) {
            this.head = new Node<>(addData);
            this.tail = this.head;
            return true;
        } else if (this.head.data == existData) {
            Node<T> newHead = new Node<>(addData);
            newHead.next = this.head;
            this.head = newHead;
            this.head.next.prev = this.head;
            return true;
        } else {
            Node<T> node = this.head;
            while(node != null) {
                if(node.data == existData) {
                    Node<T> nodePrev = node.prev;
                    nodePrev.next = new Node(addData);
                    nodePrev.next.next = node;

                    nodePrev.next.prev = nodePrev;
                    node.prev = nodePrev.prev;
                } else {
                    node = node.next;
                }
            }
        }
        return false;
    }


}
