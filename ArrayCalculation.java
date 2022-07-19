package Array;

//WAP that create integer array of 10 elements accept the values of array and find sum, max, min, avg.

import java.util.Scanner;

public class ArrayCalculation {
    static void max (int arr[]){//static method receives an arrays an argument
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){

            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

    static void min (int arr[]){//static method receives an arrays an argument
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){

            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String args[]){
        int sum = 0;
        int avg;

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

            sum = sum + arr[i];
            System.out.println("sum of elements  :  "+sum);

            avg = sum/arrLength;
            System.out.println("average of elements  :  "+avg);
        }

        System.out.println("max number");
        max(arr);

        System.out.println("min number");
        min(arr);
    }
}
