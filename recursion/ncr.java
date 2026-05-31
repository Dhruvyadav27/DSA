package recursion;
import java.util.Scanner;
public class ncr {
    static int fact(int a){
        if(a==1||a==0){
            return 1;
        }
        else{
            return a*fact(a-1);
        }
    }
    
    static int ncr(int n, int r){
          int nom,den;
          nom=fact(n);
          den=fact(r)*fact(n-r);
          return nom/den;
    }

    public static void main(String []arg){
       Scanner sc= new Scanner(System.in);
       System.out.println("enter value of n");
       int n=sc.nextInt();
       System.out.println("enter the value of r");
       int r=sc.nextInt();
       System.out.println(ncr(n,r));

    }

    
}
