package String;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void my(){ //my method
        StringTokenizer t = new StringTokenizer("I am the king of the world");
        while (t.hasMoreTokens()){
            System.out.println(t.nextToken(" "));{
                StringTokenizer st = new StringTokenizer("I am Daku,Let's play bo3");
                while (st.hasMoreTokens()) {
                    System.out.println(st.nextToken(","));
                }
            }
        }
    }
    public static void main(String args[]){
        my();
    }
}
