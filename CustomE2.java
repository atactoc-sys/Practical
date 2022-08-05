package Exceotion;

import java.util.Scanner;

public class CustomE2 {
    public static void myDisplay(int age) throws InvalidAgeexception{
        if (age<=18 || age >= 25){
            throw new InvalidAgeexception("Invalid age for java");
        }
        else {
            System.out.println("pass");
        }
    }

    public static void main(String[] args) throws InvalidAgeexception{
        CustomE2 obj = new CustomE2();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();
        obj.myDisplay(age);
        System.out.println("rest of code");
    }
}
