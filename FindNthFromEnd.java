import java.util.*;

public class FindNthFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();
        
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                throw new IllegalArgumentException("N is larger than the list size");
            }
            first.next();
        }
        
        while (first.hasNext()) {
            first.next();
            second.next();
        }
        
        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        System.out.println(findNthFromEnd(linkedList, n));
    }
}

