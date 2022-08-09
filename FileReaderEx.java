package Stream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderEx {
    public static void main(String[] args) {
        try {
            FileReader obj1 = new FileReader("C:\\Users\\HP\\Sample1.txt");

            int i;
            while ((i = obj1.read()) != -1) {
                System.out.println((char) i);
            }
            obj1.close();

        }catch (Exception e){
            System.out.println(e);


        }
    }
}


