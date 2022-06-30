public class Areasquare {
    int length;
    void insert(int l){
        length=l;
    }
    void calculateArea(){
        System.out.println(length*length);
    }
    class Areasquare1{
        public static void main(String[]args){
            Areasquare r1 = new Areasquare();
            r1.insert(8);
            r1.calculateArea();
        }
    }
}

