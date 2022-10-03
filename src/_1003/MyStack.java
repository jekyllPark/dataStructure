package _1003;

import java.util.ArrayList;

public class MyStack<T> {
    ArrayList<T> stack = new ArrayList<>();

    public void push(T data) {
        stack.add(data);
    }

    public T pop() {
        if(stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size()-1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
