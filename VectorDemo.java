package Collection;

import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args)
    {
        //  ADDING ELEMENTS IN VECTOR
        Vector<String> vc = new Vector<String>();
        vc.add("DOG");
        vc.add("CAT");
        vc.add(0,"TIGER");
        vc.add("lION");

        //  CHECKING SIZE AND CAPACITY
        System.out.println("SIZE  :  "+vc.size());
        System.out.println("CAPACITY  :  "+vc.capacity());

        //  ADD MORE ELEMENT
        vc.addElement("COW");
        vc.addElement("GOAT");
        System.out.println("AFTER ADDING ELEMENTS");
        System.out.println("SIZE  :  "+vc.size());
        System.out.println("CAPACITY  :  "+vc.capacity());

        //  PRINTING VECTOR
        System.out.println(vc);

        //  CHECKING IF A SPECIFIED ELEMENT IS PRESENT OR NOT
        if (vc.contains("CAT"))
        {
            System.out.println("ELEMENT PRESENT");
        }
        else
        {
            System.out.println("ELEMENT NOT PRESENT");
        }
        //  GETTING FIRST ELEMENTS
        System.out.println("FIRST ELEMENT  :  "+vc.firstElement());

        //  GETTING LAST ELEMENTS
        System.out.println("LAST ELEMENT  :  "+vc.lastElement());

        //  GETTING INDEX OF SPECIFIED ELEMENT
        System.out.println("INDEX  :  "+vc.indexOf("CAT"));

    }
}
