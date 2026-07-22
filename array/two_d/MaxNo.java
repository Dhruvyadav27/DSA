package array.two_d;

public class MaxNo {
    public static void main(String [] args){
        int [][] arr = {{1,3,5,4},{1,4,7,3}};
        int s= arr[0][0];
       
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
              if(arr[i][j]>s){
                s=arr[i][j];
              } 
                
            }
            
        }
        System.out.println(s);
    }
    
}
