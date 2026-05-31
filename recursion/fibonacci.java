package recursion;

public class fibonacci {
    static int a=0;
    static int b=1;
    static void fabi(int x){
         
         if(x>0){

            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            fabi(x-1);
         }

    }


    public static void main(String []arg){
       fabi(10);
    }
}
