package Array;

//WAP that create integer array of 10 elements accept the values of array and find the sum of all odd numbers

import java.util.Scanner;

public class ArrayOddSum {

    public static void main(String args[]) {
        int sum = 0;

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
        System.out.println("sum odd numbers of the array");
        for (int i = 0; i < arrLength; i++){
            if (arr[i] %2 != 0) {
                sum = sum + arr[i];
                System.out.println(sum);
            }
        }
    }
}


