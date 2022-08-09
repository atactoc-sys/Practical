package Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("C:\\Users\\HP\\Documents\\test3.txt");
            fw.write("THANK YOU...");
            FileReader fr = new FileReader("C:\\Users\\HP\\Documents\\test3.txt");
            int i;
            while ((i=fr.read())!=1){
                System.out.println((char) i);
            }
            fw.close();
            System.out.println("DONE");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
