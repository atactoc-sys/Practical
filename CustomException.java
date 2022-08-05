package Exceotion;

public class CustomException {
    public static void myDisplay(int age) throws InvalidAgeexception{
        if (age<=18 || age >= 25){
            throw new InvalidAgeexception("Invalid age for java");
        }
        else {
            System.out.println("pass");

        }
    }

    public static void main(String[] args) throws InvalidAgeexception{
        CustomException obj = new CustomException();
        obj.myDisplay(17);
        System.out.println("rest of code");
    }
}
