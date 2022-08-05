package Thrade;

//THREAD EG BY EXTENDINFG THRADE CLASS

public class Thread_Test extends Thread {
    public void run(){
        System.out.println("I Am a Thread");
    }

    public static void main(String[] args) {
        Thread_Test t1 = new Thread_Test();
        t1.start();//THRADE CLASS IS USED TO START A NEW THRADE
    }
}
