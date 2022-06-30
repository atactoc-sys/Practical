public class Areaofsquare {
    int length;
    void insert(int l){
        length = l;
    }
    void calculateArea(){
        System.out.println(length*length);
    }
    public class Areaofsquare1(){
        public static void main(String args{}){
            Areaofsquare r1=new Areaofsquare();
            r1.insert(9);
            r1.calculateArea();
        }
    }
}
