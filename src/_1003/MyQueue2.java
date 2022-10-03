package _1003;

import java.util.ArrayList;

public class MyQueue2<T> {
    ArrayList<T> queue = new ArrayList<>();
    public void enqueue(T data) {
        queue.add(data);
    }
    public T pop() {
        if(queue.isEmpty()) return null;
        return queue.remove(0);
    }
}
