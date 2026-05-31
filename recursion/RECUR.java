package recursion;
public class RECUR{
 static void fun(int n){
    if(n>0){
        
        fun(n-1);
        System.out.println(n);
    }
}

    public static void main(String[] arg){
    
        int x=6;
        fun(x);
        
    }
}