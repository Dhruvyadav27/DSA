package array.two_d;

public class Sum {
    public static void main(String [] args){
        int s=0;
        int [][] arr = {{1,3,5,4},{1,4,7,3}};
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
               s+=arr[i][j]; 
                
            }
            
        }
        System.out.println(s);
    }
}
