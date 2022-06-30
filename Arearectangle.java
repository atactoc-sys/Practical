public class Arearectangle {
    int length;
    int width;
    void insert(int l, int w){
        length=l;
        width=w;
    }
    void calculateArea(){
        System.out.println(length*width);
    }
    class Areasquare1{
        public static void main(String[]args){
            Arearectangle r1 = new Arearectangle();
            r1.insert(9,5);
            r1.calculateArea();
        }
    }
}
