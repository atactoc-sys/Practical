package Array;

import java.util.Scanner;

public class UsingScannerclass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length");
        int arrLength = sc.nextInt();
        int [] anArray = new int[arrLength];
        System.out.println("enter elements");
        for (int i = 0; i < arrLength; i++){
            anArray[i] = sc.nextInt();
        }
        System.out.println("display");
        for (int i = 0; i < arrLength; i++){
            System.out.println(anArray[i]);
        }
    }
}
