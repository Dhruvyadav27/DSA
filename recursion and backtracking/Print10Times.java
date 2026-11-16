package recursion;

public class Print10Times {
    
    public static void main(String[] args) {
        print10Times(11);
    }

    public static void print10Times(int count) {
        if (count > 10) {
            return;
        }
        System.out.println("This is line number: " + count);
        print10Times(count + 1);
    }
}
