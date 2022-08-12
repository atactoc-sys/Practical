package Collection.Linklist;

public interface FunctionalInterfaceDemo
{
    int add (int a, int b);
}
class LambdaFunction
{
    public static void main(String[] args)
    {
        FunctionalInterfaceDemo d = (a,b) ->
        {
            return (a+b);
        };
        System.out.println(d.add(40,50));
    }
}
