package Stream;

public class NestedTry {
    public static void main(String[] args) {
        //OUTER TRY BLOCK
        try {
            //INNER TRY BLOCK
            try {
                System.out.println("GOING TO DEVIDE BY 0");
                int b = 19/0;
                //INNER CATCH BLOCCK
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            // 2ND INNER TRY BLOCK
            try {
                int s[] = new int[5];
                //ASSIGNING THE VALUE OF ARRAY BOUNDS
                s[6] = 4;

            }//2ND INNER  CATCH BLOCK
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("OTHER STATEMENT");

        }//OUTER CATCH BLOCK
        catch (Exception e) {
            System.out.println("HANDELLED THE EXCEPTION");
        }
    }
}
