import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] examScores = {85, 72, 90, 60, 78, 88};
        selectionSort(examScores);
        System.out.println(Arrays.toString(examScores));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
