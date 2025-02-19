import java.util.*;

class CircularBuffer {
    private int[] buffer;
    private int head, tail, size, capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    public void enqueue(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % capacity;

        if (size < capacity) {
            size++;
        } else {
            head = (head + 1) % capacity; // Overwrite oldest element
        }
    }

    public int dequeue() {
        if (size == 0) {
            throw new NoSuchElementException("Buffer is empty");
        }
        int value = buffer[head];
        head = (head + 1) % capacity;
        size--;
        return value;
    }

    public List<Integer> getBufferContents() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(buffer[(head + i) % capacity]);
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.enqueue(1);
        buffer.enqueue(2);
        buffer.enqueue(3);
        System.out.println("Buffer: " + buffer.getBufferContents()); // [1, 2, 3]

        buffer.enqueue(4); // Overwrites oldest (1)
        System.out.println("Buffer after inserting 4: " + buffer.getBufferContents()); // [2, 3, 4]

        buffer.dequeue();
        System.out.println("Buffer after dequeue: " + buffer.getBufferContents()); // [3, 4]
    }
}

