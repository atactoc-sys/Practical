public class Price {
    double pen = 5.00;

}
class Price1 extends Price{
    double pen = 5.33;
    public static void main(String args[]){
        Price1 obj = new Price1();
        System.out.println(obj.pen);
    }
}
