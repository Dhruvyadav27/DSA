package array.string;

public class reversevowels {
    public static void main(String[] args) {
        String str = "Dhruv Yadav is a good boy";
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (isVowel(arr[i]) && isVowel(arr[j])) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (!isVowel(arr[i])) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println(new String(arr));
    }
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    
}
