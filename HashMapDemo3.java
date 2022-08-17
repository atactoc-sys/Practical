package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo3
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(101,"Mango");
        map.put(102,"Orange");
        map.put(104,"Banana");
        map.put(105,"Grapes");
        map.put(106,null);
        map.put(null,"fruit");
        map.put(null,null);
        for (Map.Entry m : map.entrySet())
        {
            System.out.println(m.getKey()+"  "+m.getValue());
        }

    }
}
