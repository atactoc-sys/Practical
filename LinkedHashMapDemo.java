package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo
{
    public static void main(String[] args)
    {
        //  ADDING ELEMENT
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
        lhm.put(200,"Riya");
        lhm.put(205,"Priya");
        lhm.put(202,"Keya");
        lhm.put(201,"Maya");
        // KEYS
        System.out.println("KEYS  :  "+lhm.keySet());
        // VALUES
        System.out.println("VALUES  :  "+lhm.values());
        //  KEY-VALUE PAIR
        System.out.println("KEY-VALUE PAIR  :  "+lhm.entrySet());
        //  REMOVE ELEMENT
        lhm.remove(202);
        for (Map.Entry m :lhm.entrySet())
        {
            System.out.println(m.getKey()+"  "+m.getValue());
        }

    }
}
