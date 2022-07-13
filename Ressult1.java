package com.emploiee;

import java.util.Scanner;

public class Ressult1 {
     public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
         System.out.println(name);
         String id = sc.nextLine();
         System.out.println(id);
         String password = sc.nextLine();
         System.out.println(password);

    int m1 = sc.nextInt();
        System.out.println(m1);
    int m2 = sc.nextInt();
        System.out.println(m2);
    int m3 = sc.nextInt();
        System.out.println(m3);
    int m4 = sc.nextInt();
        System.out.println(m4);
    int m5 = sc.nextInt();
        System.out.println(m5);
        int total = m1 + m2 + m3 + m4 + m5;
         System.out.println(total);
         int avv = total/5;
         System.out.println(avv);
     }

}
