package array.one_d;

public class secondlargest {
    public static void main (String []arg){
        int arr[]={12,15,16,18,20,27};
        int a=-1;
        int b=0;
        for(int i=0;i<6;i++){
          if(arr[i]>b){
            a=b;
            b=arr[i];
          }
            if(arr[i]<b&arr[i]>a){
                a=arr[i];
            }
        }
   
     System.out.println(a);
    }
}
