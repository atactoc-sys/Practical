public class Vehicle {//parent class
    void run(){
        System.out.println("running mode is on");
    }
    {
        class Bike extends Vehicle {// child class
            void features(){
                System.out.println("well executed fratures");
            }
            class Testsingleinherit{//main class
                public static void main(String args([]){
                    Bike b = new Bike();//obl of child class
                    b.run();//parent class method
                    b.features();//chiild class method
                }
            }
        }
    }
}
