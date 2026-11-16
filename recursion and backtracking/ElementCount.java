package recursion;

public class ElementCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //int count = countElements(arr, 0);
        //System.out.println("Number of elements in the array: " + count);
        countElements(arr, 0);
    }
    public static void countElements(int [] arr, int i){
        if(i == arr.length){
            return;
        }
        System.out.println("Element at index " + i + ": " + arr[i]);
        countElements(arr, i + 1);
        System.out.println("Element at index " + i + ": " + arr[i]);
    }
}
