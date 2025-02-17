import java.util.*;

public class DataStructureSearchComparison {
    public static void main(String[] args) {
        int size = 1000000;
        int searchElement = size - 1;
        compareSearchMethods(size, searchElement);
    }

    public static void compareSearchMethods(int size, int searchElement) {
        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        for (int i = 0; i < size; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }
        
        long startTime = System.nanoTime();
        for (int num : array) {
            if (num == searchElement) break;
        }
        long endTime = System.nanoTime();
        System.out.println("Array Search Time: " + (endTime - startTime) / 1e6 + " ms");
        
        startTime = System.nanoTime();
        hashSet.contains(searchElement);
        endTime = System.nanoTime();
        System.out.println("HashSet Search Time: " + (endTime - startTime) / 1e6 + " ms");
        
        startTime = System.nanoTime();
        treeSet.contains(searchElement);
        endTime = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (endTime - startTime) / 1e6 + " ms");
    }
}

