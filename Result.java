package com.emploiee;

public class Result {
    private String name;
    private String uid;
    private String password;
    private int m1;
    private int m2;
    private int m3;
    private int m4;
    private int m5;
    public Result(String name, String uid, String password, int m1, int m2, int m3, int m4, int m5){
        this.name=name;
        this.uid=uid;
        this.password=password;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.m5=m5;
    }

    public Result() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }

    public void setM4(int m4) {
        this.m4 = m4;
    }

    public void setM5(int m5) {
        this.m5 = m5;
    }

    public String getName() {
        return name;
    }

    public String getUid() {
        return uid;
    }

    public String getPassword() {
        return password;
    }

    public int getM1() {
        return m1;
    }

    public int getM2() {
        return m2;
    }

    public int getM3() {
        return m3;
    }
    public int getM4(){
        return m4;
    }

    public int getM5() {
        return m5;
    }

    int totalm = m1 + m2 + m3 + m4 + m5;
    void add(){
        System.out.println(totalm);
    }
    void avv(){
        System.out.println(totalm/5);
    }


}
