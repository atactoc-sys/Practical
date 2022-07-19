package Array;

public class MaxArray {//class
    static void max (int arr[]){//static method receives an arrays an argument
        int max = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (max<arr[i]){
                max=arr[i];

            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        int a[]= {10,20,30,40,50,60,2,70};//declaration & initialization of an array
        max(a);
    }
}
