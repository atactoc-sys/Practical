package Wrapper;
//premitive to wrappeer
public class Autoboxing {
    public static void main (String args[]){
        int a = 10;
        Integer i = Integer.valueOf(a);//converting int to Integer
        Integer j = a;//now compiler will write Integer .valueOf(a)autoboxing
        System.out.println(a+"  "+i+"  "+j);
    }
}
