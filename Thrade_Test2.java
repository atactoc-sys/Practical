package Thrade;

//THREAD EG BY IMPLEMENTING RUNNABLE INTERFACE

    public class Thrade_Test2 implements Runnable {
        public void run(){
            System.out.println("I Am a Thread");
        }

        public static void main(String[] args) {
            Thrade.Thread_Test t1 = new Thrade.Thread_Test();
            t1.start();//THRADE CLASS IS USED TO START A NEW THRADE
        }
    }


