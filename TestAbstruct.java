abstract class TestAbstruct {
    TestAbstruct(){
        System.out.println("Sbstruct class created");
    }
    abstract void run();
    void changespeed(){
        System.out.println("speed changed");
    }
}
class Child extends TestAbstruct{
    void run(){
        System.out.println("running safely");
    }
}
class TestAbstruct1{
    public static void main(String args[]) {
        TestAbstruct obj = new Child();
        obj.run();
        obj.changespeed();
    }
}
