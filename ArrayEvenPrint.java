package Array;

//WAP that create integer array of 10 elements accept the values of array and and print only even numbers

import java.util.Scanner;

public class ArrayEvenPrint {
    static void evenPrint (int arr[]){//static method receives an arrays an argument
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){

            if (arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String args[]) {
        int sum = 0;
        int avg;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter array length");
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];

        System.out.println("enter elements");
        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("display");
        for (int i = 0; i < arrLength; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("even numbers of the array");
        evenPrint(arr);
    }
}
