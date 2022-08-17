package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Akash");
        queue.add("Sayan");
        queue.add("Sankhajit");
        queue.add("Hasan");
        queue.add("Jaita");
        queue.add("Owashim");
        queue.add("Tonmoy");
        System.out.println("head  :   "+queue.element());
        System.out.println("head  :  "+queue.peek());
        System.out.println("TRAVERSING ELEMENT");
        Iterator itr = queue.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("AFTERR REMOVING");
        Iterator<String> itr1 = queue.iterator();
        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
    }
}
