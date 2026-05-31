package array.one_d;
import java.util.Scanner;
public class add {
    public static void main(String []arg){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int []arr= new int[10];
        arr[0]=12;
        arr[1]=10;
        arr[2]=14;
        arr[3]=1;
        arr[4]=2;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==0){
            arr[i]=x;
            break;
           }
        }  

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}

