public class RotationPointBinarySearch {
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1; // Rotation point is in the right half
            } else {
                right = mid; // Rotation point is in the left half
            }
        }
        return left; // Index of the smallest element (rotation point)
    }

    public static void main(String[] args) {
        int[] rotatedArray = {30, 40, 50, 10, 20};
        int rotationIndex = findRotationPoint(rotatedArray);
        System.out.println("Rotation point found at index: " + rotationIndex);
        System.out.println("Smallest element: " + rotatedArray[rotationIndex]);
    }
}

