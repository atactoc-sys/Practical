package Stream;

import javax.imageio.IIOException;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputSteamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream obj = new FileOutputStream("C:\\Users\\HP\\Documents\\test2.txt");
        FileOutputStream obj2 = new FileOutputStream("C:\\Users\\HP\\Documents\\test3.txt");
        ByteArrayOutputStream temp = new ByteArrayOutputStream();
        temp.write(65);
        temp.writeTo(obj);
        temp.writeTo(obj2);
        temp.close();
        System.out.println("done");
    }
}
