package Collection;

import java.util.TreeSet;

public class TreeSetDemo3
{
    public static void main(String[] args)
    {
        // CREATING AND ADDING ELEMENTS
        TreeSet<String> set = new TreeSet<String>();
        set.add("16");
        set.add("84");
        set.add("25");
        set.add("13");

        System.out.println("LOWEST VAKUE  :  "+set.pollFirst());
        System.out.println("HIGHEST VALUE  :  "+set.pollLast());
    }
}
