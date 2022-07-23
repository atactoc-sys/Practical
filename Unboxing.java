package Wrapper;
//wrapper to primitive
public class Unboxing {
    public static void main (String args[]){
        Integer a = new Integer(10);
        Integer i = a.intValue();//converting Integer to int
        Integer j = a;//now compiler will write Integer .valueOf(a)autoboxing
        System.out.println(a+"  "+i+"  "+j);
    }
}
