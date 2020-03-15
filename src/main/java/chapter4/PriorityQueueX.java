package chapter4;

public class PriorityQueueX {

    private final int maxSize;
    private long[] qArray;
    private int nItems;

    public PriorityQueueX(int maxSize) {
        this.maxSize = maxSize;
        this.qArray = new long[maxSize];
        this.nItems = 0;
    }

    public void insert(long element) {
        int j;
        if (nItems == 0) {
            qArray[nItems++] = element;
        } else {
            for (j = nItems - 1; j >= 0; j--) {
                if (element > qArray[j]) {
                    qArray[j + 1] = qArray[j];
                } else {
                    break;
                }
            }
            qArray[j + 1] = element;
            nItems++;
        }
    }

    public long remove() {
        return qArray[--nItems];
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }
}
