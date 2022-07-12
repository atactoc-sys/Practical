public class Animal {
    void eat(){
        System.out.println("live to eat");
    }
}
class NonVeg extends Animal{
    void eat(){
        System.out.println("eat non veg");
    }
}
class Veg extends Animal{
    void eat(){
        System.out.println("eat veg");
    }
}
class Test{
    public static void main(String args[]){
        Animal a = new Animal();
        NonVeg n = new NonVeg();
        Veg v = new Veg();
        a.eat();
        n.eat();
        v.eat();
    }
}
