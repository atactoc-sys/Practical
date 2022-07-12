public class Shape{
    void draw(){
        System.out.println("its a shape");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("its rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("its circle");
    }
}
class Details{
    public static void main (String args[]){
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        r.draw();
        c.draw();

    }
}
