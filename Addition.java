//method overloading :

public class Addition { //class
    static int add (int a,int b){//no. of arguments 2 add is a method 
        return(a+b);
    }
    static int add(int a,int b,int c){// //no. of arguments 2 add is a method 
       return (a+b+c); 
    }
    class overloading{
        public static void main (String args[]){
            System.out.println(Addition.add(10,10));
            System.out.println(Addition.add(10,12,16));
        }
    }
}
