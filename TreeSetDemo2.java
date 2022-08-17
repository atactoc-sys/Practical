package Collection;

import java.util.TreeSet;

// NAVIGABLE SET OPERATION

public class TreeSetDemo2
{
    public static void main(String... args)
    {

        TreeSet<String> set = new TreeSet<String>();
        set.add("m");
        set.add("n");
        set.add("o");
        set.add("p");
        set.add("q");
       // System.out.println(set.pollFirst());
       // System.out.println(set.pollLast());
        System.out.println("ORIGINAL SET   :   "+set);
        System.out.println("REVERSE SET   :   "+set.descendingSet());
        System.out.println("HEAD SET   :   "+set.headSet("o",true));
        System.out.println("SUBSET SET   :   "+set.subSet("m",true,"q",false));
        System.out.println("TAIL SET   :   "+set.tailSet("o",false));
    }
}
//  REVERSE SET , HEAD SET ,SUBSET, TAILSET