package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo
{
    public static void main(String[] args)
    {
        //creating and adding

        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Pallabi");
        deque.add("Subhrajit");
        deque.add("Monalisha");
        deque.add("Mamata");
        deque.offerFirst("Anju");
        System.out.println("AFTER OFFER FIRST");


        //TRAVERSING
        for (String str : deque)
        {
            System.out.println(str);
        }

        // deque.poll() & deque.peekFirst() same as poll
        deque.pollLast();
        System.out.println("AFTER POLL LAST");
        for (String str : deque)
        {
            System.out.println(str);
        }
    }
}
