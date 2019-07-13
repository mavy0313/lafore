package chapter4;

public class CharStack {

    private int size;
    private char[] array;
    private int top;

    public CharStack(int size) {
        this.size = size;
        this.array = new char[size];
        this.top = -1;
    }

    public void push(char element) {
        array[++top] = element;
    }

    public char pop() {
        return array[top--];
    }

    public char peek() {
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }
}
