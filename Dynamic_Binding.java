public class Dynamic_Binding {
    void run(){
        System.out.println("asdf");
    }
}
class Ijk extends Dynamic_Binding{
    void run(){
        System.out.println("jhgf");
    }
    public static void main(String args[]){
        Ijk obj = new Ijk()
        obj.run();
    }
}
