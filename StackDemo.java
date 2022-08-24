package Collection;

import java.util.Stack;

public class StackDemo
{
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        boolean result = st.empty();
        st.push(25);
        st.push(35);
        st.push(45);
        st.push(55);
        st.push(65);
        st.push(75);
        st.push(85);
        pushelement(st,10);
        
        System.out.println("Stack elements   :  "+st);
        Integer digit = st.peek();
        System.out.println("top elements  :  "+digit);
        int digit1 = st.search(35);
        System.out.println("Search elements  :  "+digit1);
        int x = st.size();
        System.out.println("Size  :  "+x);
        result = st.empty();
        System.out.println("is empty?  :  "+result);

    }

    private static void pushelement(Stack<Integer> st, int i)
    {
    }
}
