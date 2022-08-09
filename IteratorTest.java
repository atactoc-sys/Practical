package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String>as = new ArrayList<String>();
        as.add("red");
        as.add("green");
        as.add("orange");
        as.add("white");
        Iterator<String>itr=as.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
