package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapinDemo
{
    public static void main(String[] args)
    {
        Map map = new HashMap<>();
        map.put(1,"Pallabi");
        map.put(2,"Daku");
        map.put(3,"Munna");
        map.put(4,"Saikat");
        map.put(5,"Aloke");
        // TRAVERSING
        Set set = map.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext())
        {
            Map.Entry em = (Map.Entry)i.next();
            System.out.println(em.getKey()+"  "+em.getValue());
        }
    }
}
