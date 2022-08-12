package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrrayListSortDemo
{
    public static void main(String[] args)
    {
        List<String> a8 = new ArrayList<String>();
        //ADDING OBJECT TO ARRAYLIST
        a8.add("uio");
        a8.add("poi");
        a8.add("rty");
        a8.add("bhu");
        a8.add("rds");
        a8.add("ert");
        a8.add("cvb");

        System.out.println("STORING SORTED LIST");
        //SORTING ARRAYLIST
        Collections.sort(a8);
        for (String s : a8){
            System.out.println(s);
        }
        List<Integer> al = new ArrayList<Integer>();
        //ADDING OBJECT TO ARRAYLIST
        al.add(72);
        al.add(53);
        al.add(86);
        al.add(38);
        al.add(95);
        al.add(48);
        al.add(36);

        System.out.println("INTEGER SORTED LIST");
        //SORTING ARRAYLIST
        Collections.sort(al);
        for (Integer i : al)
        {
            System.out.println(i);
        }
    }
}
