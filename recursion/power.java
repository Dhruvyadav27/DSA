package recursion;
import java.util.Scanner;
public class power {
    static long pow=1;
    static void pwr(int b, int a){
         if(a>0){
            pow*=b;
            pwr(b,a-1);
         }
    }


    public static void main(String []arg){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the base");
        int base=sc.nextInt();
        System.out.println("enter the power");
        int varpwr=sc.nextInt();
        pwr(base,varpwr);
        System.out.print(pow);
    }
}
