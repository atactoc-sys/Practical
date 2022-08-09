package Stream;

public class ThrowAgeExample {
    //FUNCTION TO9 CHECK IF AGE IS ELIGIBLE TO VOTE OR NOT
    public static void mydisplay(int age){
        if (age<18){
            //THROW ARITHMETIC EXCEPTION IF NOT ELIGIBLE TO VOTE
            throw new ArithmeticException("NOT ELIGIBLE TO VOTE");

        }else {
            System.out.println("EELIGIBLE TO VOTE");
        }
    }

    public static void main(String[] args) {
        mydisplay(13);
        System.out.println("REST OF CODE");
    }
}
