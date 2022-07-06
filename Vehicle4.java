//this is why multipe inheritence dont work in java

public class Vehicle4 {//parent class a
    void run(){
        System.out.println("running mode is on");
    }
    public class Vehicle5{//parent class bm
        void run(){
            System.out.println("running mode");
        }
        class Bike extends Vehicle4,Vehicle5{//child class
            public static void main(String args[]){
                Bike b = new Bike();
                b.run();
            }
        }
    }
    
}
