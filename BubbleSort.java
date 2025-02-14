import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] marks = {85, 72, 90, 60, 78, 88};
        bubbleSort(marks);
        System.out.println(Arrays.toString(marks));
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
