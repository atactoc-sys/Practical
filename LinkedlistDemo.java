package Collection.Linklist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("Anudip");
        l1.add("Pallabi");
        System.out.println("AFTER ADDING");
        //ADDING AN ELEMENT TO SPECIFIC POSITION
        l1.add(1,"Riya");
        LinkedList<String> ll1 = new LinkedList<String>();
        //ADDING 2nd LIST AT 1st list
        ll1.add("daku");
        ll1.add("munna");
        l1.addAll(ll1);
        l1.addAll(1,ll1);
        //adding ai 1st position
        l1.addFirst("Skill");
        //adding at last
        l1.addLast("Devolopment");
        //removing
        l1.remove("Pallabi");
        l1.remove(3);
        //REMOVE ALL NEW eLEMENT
        l1.removeAll(ll1);
        //remove fest element
        l1.removeFirst();
        //remove last element
        l1.removeLast();
        //remove first occurrence element
        l1.removeFirstOccurrence("Anudip");
        //remove last occurrence element
        l1.removeLastOccurrence("Pallabi");
        //remove all element
        l1.clear();
        Iterator<String> itr = l1.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
