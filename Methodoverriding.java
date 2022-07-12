 public class Methodoverriding {
    void run(){
        System.out.println("running mode is on");
    }
}
    class Bike extends Methodoverriding{
        void run(){
            System.out.println("bike running");
        }
    
    public static void main(String args[]){
        Bike d = new Bike();
        d.run();
    }
}
     

