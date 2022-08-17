package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMaoDemo3
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(101,"Mango");
        map.put(108,"Orange");
        map.put(105,"Banana");
        map.put(103,"Grapes");
        map.put(105,"Banana");
        map.put(null,"Apple");
        map.put(null,null);
        map.put(102,null);
        map.putIfAbsent(102,"CusteeredApple");
        map.putIfAbsent(101,"Wartermellon");

        for (Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey()+"  "+m.getValue());
        }
        map.remove(103);
        System.out.println(map);
    }
}
