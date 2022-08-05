package Thrade;

public class Sequ8entialex {
    public void run(){
        for (int i = 1; i <= 5;i++){
            try {
                Thread.sleep(600);//thread sleep /stop worling for specific time
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Sequ8entialex a = new Sequ8entialex();
        Sequ8entialex b = new Sequ8entialex();
        Sequ8entialex c = new Sequ8entialex();
        a.run();
        b.run();
        c.run();
    }
}
