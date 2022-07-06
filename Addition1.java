// method overloading :changing the para meater

public class Addition1 {
    static int add (int a,int b){
        return(a+b);
    }
    static double add(double a,double b){
       return (a+b);
    }
    class overloading{
        public static void main (String args[]){
            System.out.println(Addition1.add(10,10));
            System.out.println(Addition1.add(10.06,12.98));
        }
    }
}
