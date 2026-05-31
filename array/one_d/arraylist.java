package array.one_d;
import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String []arg){
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr.get(2));
       
        System.out.println(arr);
        arr.set(3,50);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        arr.remove(2);
        Collections.reverse(arr);
        System.out.println(arr);
    }
}
