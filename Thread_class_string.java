package Thrade;

public class Thread_class_string {
    public static void main(String[] args) {
        Thread t = new Thread("first thread");
        t.start();
        String str = t.getName();
        
    }
}
