package Exceotion;

public class ThrowsEx {
    public static void myDisplay(int a) throws ArithmeticException{
        if (a>=0 && a<35){
            throw new ArithmeticException("person is not not pass");
        }
        else {
            System.out.println("pass");

        }
    }

    public static void main(String[] args) {
        myDisplay(13);
        System.out.println("rest of code");
    }
}

