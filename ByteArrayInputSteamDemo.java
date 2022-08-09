package Stream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputSteamDemo {
    public static void main(String[] args) {
        byte[] arr = {65,84,79,21,17,94};
        ByteArrayInputStream obj = new ByteArrayInputStream(arr);

        int i = 0;
        while ((i=obj.read()) != 1){
            char ch = ((char) i);
            System.out.println("ASCII CHARACTER "+i+"VALUE IS"+ch);
        }
    }
}
