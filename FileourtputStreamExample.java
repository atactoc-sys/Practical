package Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileourtputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream obj = new FileOutputStream("C:\\Users\\HP\\Documents\\test1.txt");
            obj.write(121);
            String s = "abcd";
            byte[] b = s.getBytes();
            obj.write(b);
            obj.close();
            System.out.println("done");

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
