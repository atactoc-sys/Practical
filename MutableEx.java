package String;

public class MutableEx {
    public static void my(){
        StringBuffer s = new StringBuffer("Hello");
        s.append("World");
        System.out.println("String is  :   "+s);
        s.insert(2,"Daku");
        System.out.println("Insert is  :   "+s);
        s.replace(1,4,"Java");
        System.out.println("replace is  :   "+s);
        StringBuilder s1 = new StringBuilder("World");
        s1.replace(1,3,"Java");
        System.out.println("replace is  :   "+s1);
        s1.delete(1,3);
        System.out.println("delete is  :   "+s1);
        s1.reverse();
        System.out.println("reverse is  :   "+s1);

    }
    public static void main(String args[]){
        my();
    }
}
