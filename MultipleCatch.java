package Stream;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a [] = new int[5];
            a [55] = 30/0;

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexBound Exception Occurs");
        } catch (Exception e){
            System.out.println("Present Exception Occurs");
        }
        System.out.println("Rest of Code");
    }
}
