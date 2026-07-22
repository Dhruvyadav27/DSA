package array.two_d;

public class MaxSumRow {
    public static void main(String [] args){
        int [][] arr = {{1,3,5,4},{1,4,7,3}};
        int s= 0;
        int maxsum =0;
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
              
                s+=arr[i][j];
              
                
            }
            if(maxsum<s){
                maxsum=s;
            }
            s=0;
        }
        System.out.println(maxsum);
    }
}
