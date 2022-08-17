package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("Saikat");
        set.add("Tridip");
        set.add("Arin");
        set.add("Joti");
        set.add("Joti");
        set.add("Koushik");
        System.out.println("ORIGINAL LIST   :  "+set);
        //REMOVING ELEMENTS
        System.out.println(set.remove("Koushik"));
        set.remove("Arin");
        //removing daku
        System.out.println(set.remove("daku"));
        Iterator<String>i = set.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
