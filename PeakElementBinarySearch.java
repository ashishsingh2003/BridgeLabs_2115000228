public class PeakElementBinarySearch {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1]) {
                right = mid; // Peak is in the left half (including mid)
            } else {
                left = mid + 1; // Peak is in the right half
            }
        }
        return left; // Peak index found
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 7, 8, 6, 2, 5};
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element found at index: " + peakIndex);
        System.out.println("Peak element: " + nums[peakIndex]);
    }
}

