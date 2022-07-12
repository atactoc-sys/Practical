public interface TestInterface {
    void printH();

}
class A4 implements TestInterface{
    public void printH(){
        System.out.println("helloe");
    }
    public static void main(String args[]) {
        A4 obj = new A4();
        obj.printH();
        
    }
}
