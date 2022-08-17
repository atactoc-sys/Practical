package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo
{
    public static void main(String... args)
    {
        HashSet<String> set = new HashSet<>();
        set.add("Saikat");
        set.add("Tridip");
        set.add("Arin");
        set.add("Joti");
        set.add("Joti");
        set.add("Koushik");
        System.out.println("ORIGINAL LIST"+set);

        //REMOVING SPECIFIC ELEMENT
        set.remove("Koushik");
        System.out.println("AFTER INVOKING REMOVE METHOD"+set);

        // NEW ELEMENTS
        HashSet<String> set1 = new HashSet<>();
        set1.add("asdf");
        set1.add("uiop");
        System.out.println("UPDATED LIST"+set);

        //REMOVE ALL NEW ELEMENTS
        set.removeAll(set1);

        //REMOVE ALL
        set.clear();

        Iterator<String>itr = set.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
