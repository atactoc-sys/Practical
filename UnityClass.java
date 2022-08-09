package Stream;

public class UnityClass {
    private Object o;

    public UnityClass(Object o) {
        super();
        this.o = o;
    }

    public Object getO() {
        return o;
    }
    public void show(){
        System.out.println("O IS "+o.getClass().getName());
    }

    public static void main(String[] args) {
        UnityClass u1 = new UnityClass(123);
        u1.show();
        UnityClass u2 = new UnityClass(123.45);
        u2.show();
        UnityClass u3 = new UnityClass("Daku")
        int y1 = (Integer)u1.getO();
        y1++;
        System.out.println(y1);
        double d = (Double)u2.getO();
        d++;
        String s = (String)u3.getO();
        s=s.concat("Is Here");
        System.out.println(s);
    }
}
