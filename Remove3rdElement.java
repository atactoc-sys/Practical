package Collection;

import java.util.ArrayList;
import java.util.List;

public class Remove3rdElement
{
    public static void main(String[] args)
    {
        //CREATING ARRAYLIST
        List<String> d = new ArrayList<String>();
        d.add("red");
        d.add("white");
        d.add("blue");
        d.add("green");
        System.out.println(d);
        //REMOVING ELEMENT AT INDEX 3
        d.remove(2);
        System.out.println("AFTER REMOVING"+d);

    }
}
