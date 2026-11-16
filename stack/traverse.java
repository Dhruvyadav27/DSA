package stack;

import java.util.Stack;

public class traverse {
     public static void main(String [] args){

        Stack<String> st = new Stack<>();
        System.out.println(st.size() == 0);
        Stack<String> st2 = new Stack<>();
        st.push("Dhruv");
        st.push("mulayam");
        st.push("dev");
        st.push("Diksha");

        while(st.size() > 0){
            String top = st.pop();
            System.out.println(top);

            st2.push(top);
        }
        while(st2.size() > 0){
            String top = st2.pop();
            System.out.println(top);
            st.push(top);
        }

     }
}
