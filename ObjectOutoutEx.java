package Stream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutoutEx {
    public static void main(String[] args) {
        try {
            Student s = new Student(111,"daku",1234);
            FileOutputStream obj = new FileOutputStream("C:\\Users\\HP\\Documents\\test3.txt");
            ObjectOutputStream obj2 = new ObjectOutputStream(obj);
            obj2.writeObject(s);
            obj2.close();
            System.out.println("done");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
