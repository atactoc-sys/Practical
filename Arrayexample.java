package Array;

public class Arrayexample {
    public static void main (String args[]){
        String [] name = {"DAKU","MUNNA","BAPAN"};
        for (int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
        System.out.println();
        int [] phone = {122,123,124};
        for (int n : phone){
            System.out.println(n);
        }
    }
}
