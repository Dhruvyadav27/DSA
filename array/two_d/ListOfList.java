package array.two_d;

import java.util.ArrayList;

public class ListOfList {
    public static void main(String [] args){
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
       list.add(new ArrayList<Integer>() {{ add(1); add(2); add(3); }});
       list.add(new ArrayList<Integer>() {{ add(4); add(5); add(6); }});
       list.add(new ArrayList<Integer>() {{ add(7); add(8); add(9); }});

       System.out.println(list.get(0).get(0));
       list.get(0).set(2, 10);
       System.out.println(list.get(0).get(2));
       list.get(1).add(11);
       System.out.println(list.get(1).get(3));
       list.add(new ArrayList<>());
    
    }
}
