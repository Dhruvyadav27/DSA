package recursion;

public class PrintArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        print10Times(arr, 0);

    }

    public static void print10Times(int [] arr, int i) {
        if (i >= arr.length) {
            return;
        }
        System.out.println("This is line number: " + arr[i]);
        print10Times(arr, i + 1);
    }
}
