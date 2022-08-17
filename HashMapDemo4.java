package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo4
{
    public static void main(String[] args)
    {
        Map<Integer,String> mp = new HashMap<Integer,String>();
        mp.put(101,"Pallabi");
        mp.put(102,"Rahul");
        mp.put(200,"Sweata");
        mp.put(100,"Karan");
        // TRAVERSING ELEMENTS
        for (Map.Entry em : mp.entrySet())
            System.out.println(em.getKey()+"    "+em.getValue());
    }
}
