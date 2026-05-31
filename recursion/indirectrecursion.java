package recursion;

public class indirectrecursion {
    static void sum(int a, int b){
       if(a+b<100){
            fun(a+5,b+5);
       }
       else{
        System.out.println(a+b);
       }
    }
       static void fun(int c, int d){
            if(c+d<100){
            sum(c+10, d+10);

            }
            else{
                System.out.println(c+d);
            }
       }
    
    public static void main (String[]arg){
        sum(10,10);
        fun(10,10);
    }
}
