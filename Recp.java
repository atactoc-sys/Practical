public class Recp {
    int length;
    int width;
    int param;
    void insert(int l, int w){
        length=l;
        width=w;

    }
    void calculateParameater(){
        System.out.println(2*(length + width));
    }
    class Rec{
         static void main(String args[]){
            Recp r1=new Recp();
            Recp r2=new Recp();
            r1.insert(6,9);
            r2.insert(4,7);
            r1.calculateParameater();
            r2.calculateParameater();
        }
    }
}
