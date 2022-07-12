abstract class Abstruct {
    abstract void  run();
}
class Child extends Abstruct{ 
    void run(){
        System.out.println("1236");
    }
    public static void main(String args[]){
        Child obj = new Child();
        obj.run();
    }
} 
