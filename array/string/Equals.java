package array.string;

public class Equals {
    public static void main(String[] args) {
        String s1 = "Dhruv";
        String s2 = "Dhruv";
        String s3 = new String("Dhruv");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
