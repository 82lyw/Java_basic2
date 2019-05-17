package Queue;

public class Queue {
    private int size;
    private int[] element;
    public static final int DEFAULT_CAPACITY = 8;

    Queue() {
        this(DEFAULT_CAPACITY);
    }

    Queue(int capacity) {
        element = new int[capacity];
    }

    public void enqueue(int value) {
        if (size >= element.length) {
            int[] temp = new int[element.length * 2];
            System.arraycopy(element,0,temp,0,element.length);
            element = temp;
        }

        element[size++] = value;
    }

    public int dequeue() {
        int value = element[0];
        for (int i = 0;i <= size - 1;i++) {
            element[i] = element[i + 1];
        }
        size--;
        return value;
    }

    public boolean empty() {
        return size==0;
    }

    public int getSize() {
        return size;
    }

}
