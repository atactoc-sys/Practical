
import java.lang.*;
public class Aggregation {//class 1
    int Squre (int n){
        return n*n;
    }
    
}
class circle{//class2
    Aggregation ag;// obj (entity ref)line2
    double  pi = 3.14;
    double area (int radious){
        ag = new Aggregation();//line1
        int psqure = ag.Squre(radious);//line2
        return pi*psqure;
    }
    public static void main (String args[]) {//main method
        circle c= new circle();
        double result=c.area(5);
        System.out.println(result);
    }
}
