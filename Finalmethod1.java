public class Finalmethod1 {
    //creat a final method
    public final void display(){
        System.out.println("THIS IS A FINAL METHOD");
    }
}
class Main extends Finalmethod1 {
    //try to override final method
    public final void display(){
        System.out.println("this final method is overriding");
    }
    public static void main(String args[]){
        Main obj = new Main();
        obj.display();
    }
}
