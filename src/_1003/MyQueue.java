package _1003;

import java.util.ArrayList;

public class MyQueue<T> {
    ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T data) {
        queue.add(data);
    }

    public T dequeue() {
        if(queue.isEmpty()) return null;
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
