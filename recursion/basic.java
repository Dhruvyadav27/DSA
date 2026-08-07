package recursion;

public class basic {
    public static void main(String[] args) {
       index(1);
    }  
    public static void index(int count) {
        if (count > 10) {
            return;
        }
        int i =0;
        i++;
        System.out.println("This is line number: " + i);
        index(count + 1);
    }
}
