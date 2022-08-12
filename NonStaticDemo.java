package Collection;

public class NonStaticDemo
{
    public static void main(String[] args)
    {
        SampleTest s = new SampleTest();
        Threadtest t1;
        t1 = new Threadtest(s);
        Threadtest1 t2;
        t2 = new Threadtest1(s);
        t1.start();
        t2.start();
    }
}
