package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeuedwmo2
{
    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<String>();

        dq.add("Ram");
        dq.add("adh");
        dq.add("opl");
        dq.add("yui");
        dq.add("efy");

        for (String s : dq)
        {
            System.out.println(s);
        }

        dq.addFirst("NJI");
        dq.addLast("PLK");
        System.out.println("NEW LIST");

        for (String s1 : dq)
        {
            System.out.println(s1);
        }

        dq.removeFirst();
        dq.removeLast();

        System.out.println("NEW LIST AFTER REMOVAL");

        for (String s2 : dq)
        {
            System.out.println(s2);
        }
    }
}
