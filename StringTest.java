package String;

import java.util.Locale;
import java.util.Scanner;

public class StringTest {
    public void show(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length()+B.length());
        System.out.println((A.compareTo(B)>0) ? "Yes" : "No");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
    }
    public static void main(String args[]){
        StringTest t = new StringTest();
        t.show();
    }
}
