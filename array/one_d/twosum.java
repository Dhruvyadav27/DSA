package array.one_d;

public class twosum {
    public static void main(String[]arg){
        int arr[]={2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
           if(arr[i]+arr[j]==7){
            System.out.println(arr[i]+","+arr[j]);
           }
        }  
        }

    }
    
}
