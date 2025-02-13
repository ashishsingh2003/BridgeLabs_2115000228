import java.util.*;

class Node {
    int key, value;
    Node next;
    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class CustomHashMap {
    private static final int SIZE = 1000;
    private Node[] map;

    public CustomHashMap() {
        map = new Node[SIZE];
    }

    private int getHash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = getHash(key);
        if (map[index] == null) {
            map[index] = new Node(key, value);
        } else {
            Node current = map[index];
            while (current != null) {
                if (current.key == key) {
                    current.value = value;
                    return;
                }
                if (current.next == null) break;
                current = current.next;
            }
            current.next = new Node(key, value);
        }
    }

    public int get(int key) {
        int index = getHash(key);
        Node current = map[index];
        while (current != null) {
            if (current.key == key) return current.value;
            current = current.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = getHash(key);
        Node current = map[index];
        Node prev = null;
        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    map[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap hashMap = new CustomHashMap();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        System.out.println(hashMap.get(1));
        hashMap.remove(1);
        System.out.println(hashMap.get(1));
    }
}

