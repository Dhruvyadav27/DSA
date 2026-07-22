package array.two_d;

public class ForEachLoop {
    public static void main(String [] args){
        int [][] arr = {{1,3,5,4},{1,4,7,3}};
        for(int [] a:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
