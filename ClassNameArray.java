package Array;
//to get the class name of array
public class ClassNameArray {
    public static void main(String args[]){
        int arr [] = {1,2,3}; // declare & initialization off van array
        Class c = arr.getClass();//getting th class name
        String name = c.getName();
        System.out.println(name);//print the class name
    }
}
