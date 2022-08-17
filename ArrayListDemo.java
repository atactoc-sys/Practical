package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //CREATING ARRAYLIST
        List<String> a1 = new ArrayList<String>();

        //ADDING OBJECT TO ARRAYLIST
        a1.add("Saikat");
        a1.add("Daku");
        a1.add("Akash");
        a1.add("Arnab");
        a1.add("Oashim");
        a1.add("Pritam");
        a1.add("Sagnik");

        //PRINTING ARRAYLIST OBJECT
        System.out.println("SIZE OF ARRAYLIST  :  "+a1.size());

        //REMOVING ELEMENT AT INDEX 5
        a1.remove(5);

        //PRINTING AFTER REMOVING
        System.out.println(a1);
        System.out.println("SIZE OF ARRAYLIST  :  "+a1.size());

        a1.add("Ravi");
        a1.add("Viswa");
        System.out.println(a1);
        System.out.println("SIZE OF ARRAYLIST  :  "+a1.size());
        System.out.println("ELEMENT OF INDEX VALUE IS  :  "+a1.get(6));

        System.out.println("TRAVERSING USING FOR LOOP");
        for (int i = 0; i < a1.size(); i++){
            System.out.println(a1.get(i));

        }

        System.out.println("TRAVERSING USING FOR EACH LOOP");
        for (String s :a1){
            System.out.println(s);

        }

        System.out.println("TRAVERSING USING ITERATOR");
        Iterator <String> itr = a1.iterator();
        while (itr.hasNext()){//CHECKING ITERATOR HAS ELEMENT
            System.out.println(itr.next());//PRINTING ELEMENT & MOVE TO NEXT

        }

        System.out.println("TRAVERSING USING LIST ITERATOR-FORWARD");
        ListIterator<String> itr1 = a1.listIterator();//GETTING ITERATOR
        while (itr1.hasNext()){//CHECKING ITERATOR HAS ELEMENT
            System.out.println(itr1.next());//PRINTING ELEMENT AND MOVE TO NEXT

        }

        System.out.println("TRAVERSING USING LIST ITERATOR-BACKWARD");
        ListIterator<String> itr2 = a1.listIterator(a1.size());//GETTING ITERATOR
        while (itr2.hasPrevious()){//CHECKING ITERATOR HAS ELEMENT
            System.out.println(itr2.previous());//PRINTING
        }

    }

}

