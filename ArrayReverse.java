package Array;

import java.util.Scanner;

public class ArrayReverse {

    static void reverse(int arr []){
        for (int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length");
        int arrLength = sc.nextInt();
        int [] arr = new int[arrLength];
        System.out.println("enter elements");
        for (int i = 0; i < arrLength; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("display");
        for (int i = 0; i < arrLength; i++){
            System.out.println(arr[i]);
        }
        System.out.println("array in reverse");
        reverse(arr);

    }
}
