package String;

public class StringExmple {
    public void show(){
        char [] arr = {'j','a','v','a'};
        String s = new String(arr);
        System.out.println("the value is  :  "+s);
        System.out.println(arr);
    }
    public void myfunction(){
        String n = "Daku";
        String n1 = "Daku";
        String n2 = new String("Daku");
    }
    public static void main(String args[]){
        StringExmple obj = new StringExmple();
        obj.show();
        obj.myfunction();
    }
}
