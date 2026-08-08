package BinarySearch;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Target not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1); // Search in the left half
        } else {
            return binarySearch(arr, target, mid + 1, high); // Search in the right half
        }
    }
}
