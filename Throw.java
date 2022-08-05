package Exceotion;

public class Throw {
    public static void elegible(int age){
        if (age<18){
            throw new ArithmeticException("person is not elegible");
        }
        else {
            System.out.println("eligible");

        }
    }

    public static void main(String[] args) {
        elegible(14);
        System.out.println("rest of code");
    }
}
