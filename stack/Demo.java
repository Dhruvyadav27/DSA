package stack;

import java.util.Stack;

public class Demo {
    public static void main(String [] args){

        Stack<String> st = new Stack<>();
        System.out.println(st.size() == 0);

        st.push("Dhruv");
        st.push("mulayam");
        st.push("dev");
        st.push("Diksha");

        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        String s = st.pop();
    }
}
