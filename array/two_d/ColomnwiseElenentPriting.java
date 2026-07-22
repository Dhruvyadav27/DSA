package array.two_d;

public class ColomnwiseElenentPriting {
     public static void main(String [] args){
        int [][] arr = {{1,3,5,4},{1,4,7,3}};
        for(int i=0;i<4;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}

