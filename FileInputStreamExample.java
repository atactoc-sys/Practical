package Stream;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        int i = 0;
        try {
            FileInputStream obj = new FileInputStream("C:\\Users\\HP\\Documents\\test1.txt");
            i = obj.read();
            System.out.println(((char) i));
            //WHILE LOOP
            while ((i = obj.read()) != -1) {
                System.out.println(i);
                System.out.println(((char) i));
            }
            obj.close();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(((char) i));
        }
    }
}
