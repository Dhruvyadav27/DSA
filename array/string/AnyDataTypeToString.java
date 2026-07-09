package array.string;
import java.util.*;

public class AnyDataTypeToString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        s+=n;
        System.out.println(s);

        String s1 = Integer.toString(n);
        System.out.println(s1);

        int n1 = Integer.parseInt(s1);
        System.out.println(n1+1);

    }
}
