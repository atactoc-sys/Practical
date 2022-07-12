abstract class Abshape {
    abstract void draw(){
        System.out.println("its a shape");
    }
}
class Rectangle extends Abshape{
    void draw(){
        System.out.println("its rectangle");
    }
}
class Circle extends Abshape{
    void draw(){
        System.out.println("its circle");
    }
}
class Details{
    public static void main (String args[]){
        Abshape obj;
       obj = new Rectangle();
       obj.draw();
       obj = new Circle();
       obj.draw();

    }
}
    
