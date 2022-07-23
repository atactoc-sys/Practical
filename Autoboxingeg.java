package Wrapper;

import java.util.ArrayList;

public class Autoboxingeg {
    public static void main(String args[]){

        ArrayList<Integer>a1 = new ArrayList<Integer>();
        //creating an empty arraylist of Integer type
        a1.add(1);//adding the int primitive type value by using add() method
        a1.add(2);
        a1.add(3);//autoboxing
        System.out.println("ArrayList  :  "+a1);
    }
}
