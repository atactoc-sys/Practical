package String;

import java.util.Scanner;

public class StringEquality {
    public static void main (String args[]){
        String str1,str2;
        Scanner sc = new Scanner(System.in);
        System.out.println("1");
        str1=sc.nextLine();
        System.out.println("2");
        str2 = sc.nextLine();
        if (str1.equals(str2)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
