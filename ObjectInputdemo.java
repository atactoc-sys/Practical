package Stream;

import java.io.*;

public class ObjectInputdemo {
    public static void main(String[] args) {
        try {
            ObjectInputStream obj2 = new ObjectInputStream(new FileInputStream("C:\\Users\\HP\\Documents\\test3.txt"));
            Student s = (Student)obj2.readObject();
            System.out.println(s.id+s.name+s.fees);
            obj2.close();
            System.out.println("done");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
