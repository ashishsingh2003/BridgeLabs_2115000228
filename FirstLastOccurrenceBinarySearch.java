public class FirstLastOccurrenceBinarySearch {
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, first = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                first = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 2, 3, 4, 5, 5, 6};
        int target = 2;

        int first = findFirstOccurrence(sortedArray, target);
        int last = findLastOccurrence(sortedArray, target);

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}

