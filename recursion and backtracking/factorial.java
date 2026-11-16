package recursion;
public class factorial {
    static long a=1;
    static void fact(int b){
        if(b>0){
            a*=b;
            fact(b-1);
        }
    }


    public static void main(String[]arg){
        fact(20);
        System.out.println(a);
    }
}
