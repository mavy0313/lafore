package chapter4;

public class StackX {

    private int size;
    private long[] array;
    private int top;

    public StackX(int size) {
        this.size = size;
        this.array = new long[size];
        this.top = -1;
    }

    public void push(int element) {
        array[++top] = element;
    }

    public long pop() {
        return array[top--];
    }

    public long peek() {
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}
