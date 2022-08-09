package Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        try {
            FileWriter obj = new FileWriter("C:\\Users\\HP\\Sample1.txt");
            obj.write("I am daku");
            FileReader obj1 = new FileReader("C:\\Users\\HP\\Sample1.txt");

            int i;
            while ((i = obj1.read()) != -1) {
                System.out.println((char) i);
            }
            obj.close();
            obj1.close();

            System.out.println("Done");


        }catch (Exception e){
            System.out.println(e);


        }
    }
}
