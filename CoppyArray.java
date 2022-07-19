package Array;

public class CoppyArray {// class
    public static void main(String args[]) {
        char[] copyForm = {'a', 'g', 'i', 'o', 'u', 'f'};//declaration and initialization of an array

        char[] copyTo = new char[5];
        System.arraycopy(copyForm,1,copyTo,0,5);// setting limit to coppy
        System.out.println(String.valueOf(copyTo));
    }
}
