package Collection.Linklist;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedlist
{
    public static void main(String[] args)
    {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Munna");
        l1.add("Arin");
        l1.add("Ram");
        l1.add("Daku");
        //TRAVERSING THE LIST OF ELEMENT IN REVERSE ORDER
        Iterator i = l1.descendingIterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
