package Stream;

public class ThrowTest {
    public static void checknum (int num){
        if (num > 0){
            throw new ArithmeticException("NUMBER IS NEGATIVE");

        } else {
            System.out.println("EXECUTE PROPERLY");
        }
    }

    public static void main(String[] args) {
        ThrowTest obj = new ThrowTest();
        obj.checknum(6);
        System.out.println("EXECUTED");
    }
}
