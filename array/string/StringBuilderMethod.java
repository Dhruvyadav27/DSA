package array.string;

public class StringBuilderMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(10);
        sb.append("Dhruv");
        sb.append(" Yadav");
        System.out.println(sb);
        sb.insert(5, " Kumar");
        System.out.println(sb);
        sb.delete(5, 10);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.charAt(0);
        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'R');
        System.out.println(sb);

        String s = "ram";
        String s1 ="mar";
        System.out.println(s==s1);
        System.out.println(s.equals(s1));

        s.toCharArray();
        System.out.println(s.toCharArray());
    }
}
