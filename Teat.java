public class Teat {
    public static void main (String args[]){
        Coppycons c1 = new Coppycons("Arin",56.25);
        Coppycons cloneofc1=new Coppycons(c1);
        c1.setName("Suman");
        System.out.println("student"+c1.getName());
        System.out.println("student"+cloneofc1.getName());
    }
}
