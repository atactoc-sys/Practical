package Array;

public class CloneArray {
    public static void main(String args[]){

        int  [] arr = {44,4,5,6};//declaration & initialization of an array
        System.out.println("print actual array");
        for (int i:arr)// for each loop
            System.out.print(i+"  ");
        System.out.println("print clone");
        int carr[]=arr.clone();//creating clone
        for (int i:arr)//for each loop for ceating an array
            System.out.print(i+"   ");
        System.out.println("both are equal or not?");
        System.out.println(arr==carr);//checking
    }
}
