// this class is for Result.java, if you found the issue please let me no, 
// I tried to add  userinput in seter method, its only taking 3 input plz help


package com.emploiee;

import java.util.Scanner;

public class Test_Result {
    public static void main(String args[]){
        Result obj = new Result();
        Scanner sc = new Scanner(System.in);
        obj.setName(sc.nextLine());
        obj.setUid(sc.nextLine());
        obj.setPassword(sc.nextLine());
        Scanner gh = new Scanner(System.in);
        obj.setM1(gh.nextInt());
        obj.setM2(gh.nextInt());
        obj.setM3(gh.nextInt());
        obj.setM4(gh.nextInt());
        obj.setM5(gh.nextInt());
        System.out.println("name  :  "+obj.getName());
        System.out.println("user id  :  "+obj.getUid());
        System.out.println("password   :  "+obj.getPassword());
        System.out.println("m1  :  "+obj.getM1());
        System.out.println("m2  :  "+obj.getM2());
        System.out.println("m3  :  "+obj.getM3());
        System.out.println("m4  :  "+obj.getM4());
        System.out.println("m5  :  "+obj.getM5());
        obj.add();
        obj.avv();
    }
}
