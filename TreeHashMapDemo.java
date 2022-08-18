package Collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapDemo
{
    public static void main(String[] args)
    {
        //  ADDING ELEMENTS
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(200,"Riya");
        tm.put(205,"Priya");
        tm.put(202,"Keya");
        tm.put(201,"Maya");

        //  DESCENDING ORDER
        System.out.println("DESCENDING MAP"+tm.descendingMap());

        //  head map
        System.out.println("HEAD MAP  :  "+tm.headMap(201,true));

        //  TAIL MAP
        System.out.println("TAIL MAP  :  "+tm.tailMap(201,true));

        //  SUB MAP
        System.out.println("SUB MAP  :  "+tm.subMap(201,true,205,true));


        //SORTED MAP  {
        System.out.println("SORTED MAP");
        //  head map
        System.out.println("HEAD MAP  :  "+tm.headMap(201));

        //  TAIL MAP
        System.out.println("TAIL MAP  :  "+tm.tailMap(201));

        //  SUB MAP
        System.out.println("SUB MAP  :  "+tm.subMap(201,205));

        //   }

        //  TRAVERSING
        for (Map.Entry m : tm.entrySet())
        {
            System.out.println(m.getKey()+"  "+m.getValue());
        }

        //  REMOVING
        tm.remove(205);
        System.out.println("AFTER REMOVING");

        //  TRAVERSING
        for (Map.Entry m : tm.entrySet())
        {
            System.out.println(m.getKey()+"  "+m.getValue());
        }

    }
}
