package Collection;

import java.util.ArrayList;
import java.util.List;

public class InsertArray {
    public static void main(String[] args) {
        List<String> ab = new ArrayList<>();
        ab.add("Red");
        ab.add("Green");
        ab.add("Orange");
        ab.add("White");
        ab.add("Black");
        System.out.println(ab);

        ab.add(0, "pink");

        System.out.println(ab);

    }
}
