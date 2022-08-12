package Collection;

public class SampleTest
{
    //void print (int num){//non syncmethod
    synchronized void print (int num)
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(num*i);
            try
            {
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class Threadtest extends Thread
{
    //public vuid run(){
    //samplrTest.prrint(3)
    SampleTest t;

    public Threadtest(SampleTest s) {

    }

    public void thread(SampleTest t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(3);
    }
}
class Threadtest1 extends Thread
{
    //public vuid run(){
    //samplrTest.prrint(3)
    SampleTest t;

    public Threadtest1(SampleTest s) {

    }

    public void thread(SampleTest t)
    {
        this.t=t;
    }
    public void run()
    {
        t.print(5);
    }
}

