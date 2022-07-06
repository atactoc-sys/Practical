public class Vehicle1 {//parent class
    void run(){
        System.out.println("running mode is on");
    }
    {
        class Bike extends Vehicle1 {// child class
            void features(){
                System.out.println("well executed fratures");
            }
            class Bmw extends Bike{// child class
                void speed(){
                    System.out.println("verry high speed");
                }
            }
            class Testmultiinherit{//main class
                public static void main(String args([]){
                    Bmw d = new Bmw();//obl of child class
                    d.run();//parent class method
                    d.features();//chiild class method
                    d.speed();
                }
            
            }
        }
    }
}

