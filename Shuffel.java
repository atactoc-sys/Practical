package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffel
{
    public static void main(String[] args)
    {
        //CREATING ARRAYLIST
        List<String> d = new ArrayList<String>();
        d.add("red");
        d.add("white");
        d.add("blue");
        d.add("green");
        //SHUFFLING ELEMENTS
        Collections.shuffle(d);
        System.out.println(d);
    }
}
