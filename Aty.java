public interface Aty {
    void a();
    void b();
    void c();
    void d();
}
abstract class Tyu implements Aty{
    public void c() {
        System.out.println("C");
    }
} 
class Oggy extends Tyu {
    public void a(){
        System.out.println("A");
    }
    public void b(){
        System.out.println("B");
    }
    public void d(){
        System.out.println("D");
    }

}
class Poi{
    public static void main(String args[]) {
       Oggy obj = new Oggy(); 
       obj.a();
       obj.b();
       obj.c();
       obj.d();
    }
}

