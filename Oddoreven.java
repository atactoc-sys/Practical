import java.util.*;
class Oddoreven{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);//object created
        int a = sc.nextInt();//taking userinput
        
        if (a % 2 == 0){  // conditional part
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
