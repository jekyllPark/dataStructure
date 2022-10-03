package _1003;

public class SingledLinkedList<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (head != null) {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(data);
        } else {
            head = new Node<>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println("node = " + node);
            while (node.next != null) {
                node = node.next;
                System.out.println("node = " + node);
            }
        } else {
            System.out.println("no data");
        }
    }

    public Node<T> search(T data) {
        if(head != null) {
            Node<T> node = this.head;
            while(node != null) {
                if(node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);
        if(searchedNode == null) {
            this.addNode(data);
        }else{
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<>(data);
            searchedNode.next.next = nextNode;
        }
    }

    public boolean delNode(T data) {
        if(this.head == null) return false;
        Node<T> node = this.head;
        if(node.data == data) {
            this.head = this.head.next;
            return true;
        }else{
            while(node.next != null) {
                if(node.next.data == data) {
                    node.next = node.next.next;
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }
}
