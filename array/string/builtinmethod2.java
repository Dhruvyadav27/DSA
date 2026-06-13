package array.string;

public class builtinmethod2 {
    public static void main(String[] args) {
        String str = "Dhruv Yadav ";
        
        String s = "Dhruv";
        String s1= "2345";

        System.out.println(s.compareTo(s1));
        System.out.println(s.compareTo(str));

        System.out.println(str.concat(s));

        s= s+" is a best coder";
        System.out.println(s);

        s1 = str + s;
        System.out.println(s1);

        System.out.println(str.equals(s));

        System.out.println(str.equalsIgnoreCase(s));

        System.out.println(str+10+12);

        System.out.println(10+20+str);

        

    }
}
