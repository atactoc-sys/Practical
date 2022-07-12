public class Boxer {
    void run(){
        System.out.println("40");
    }
}
class Mht extends Boxer{
    void run(){
        System.out.println("35");
    }
    public static void main(String args[]){
        Mht obj = new Mht();
        obj.run();
    }
}
