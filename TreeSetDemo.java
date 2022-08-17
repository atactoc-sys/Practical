package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String... args)
    {
        // CREATING AND ADDING ELEMENT
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("ball");
        ts.add("cat");
        ts.add("apple");
        ts.add("dog");
        ts.add(null);
        //TRAVRESING
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
