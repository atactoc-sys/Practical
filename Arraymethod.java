package Array;

public class Arraymethod {
    static  int[]get(){//method that returns an array
        return new int[]{10,20,30,40};
    }
    public static void main(String args[]){
        int arr[]=get();
        for (int i = 0; i < arr.length; i++){//print thee array
            System.out.println(arr[i]);
        }
    }
}
