public class Overloadingtypepromo {//class
    void add (int a, long b){//method 1
        System.out.println(a+b);
    }
    void add (int a,int b, int c){//method 2
        System.out.println(a+b+c);
    }
    public static void main (String args[]){
        Overloadingtypepromo obj = new Overloadingtypepromo();
        obj.add(15,16);//2nd int will promoted to long
        obj.add(15,16,17)
    }
}
