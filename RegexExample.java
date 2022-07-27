package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String args[]){
        Pattern p = Pattern.compile(".a");
        Matcher m = p.matcher("ma");
        boolean b = m.matches();
        boolean bb = Pattern.compile("..m") .matcher("aam").matches();
        boolean b1 = Pattern.matches("[a-zA-Z0-9]{8,}","Anudi123ppp");
        boolean b2 = Pattern.matches("[6789]{1}[0-9]{9}","9874563210");
        boolean b3 = Pattern.matches("^[a-z0-9+_.-]*@[a-zA-Z0-9]*+\\.[a-z]{3}","loordrty@gmail.com");
        boolean b4 = Pattern.matches("^[a-zA-z0-9+_.-]{8,}","kaavi@123_.");
        System.out.println(b);
        System.out.println(bb);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);


    }
}
