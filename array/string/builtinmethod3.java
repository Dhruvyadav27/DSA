package array.string;

public class builtinmethod3 {
    public static void main(String[] args) {
        String str = "123456";
        int n=Integer.parseInt(str);
        System.out.println(n + 5);

        String str1 ="Dhruv yadav";
        char [] arr = str1.toCharArray();

        for (char ch : arr){
            System.out.println(ch);
        }
    }
}
