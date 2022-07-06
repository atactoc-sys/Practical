

public class Inheritenceisa {//parent class
    float salary = 40000;
}
class Inherit extends Inheritenceisa{//child class
    int bonus = 10000;
    public static void main(String args[]){
        Inherit i = new Inherit();//chind class object
        System.out.println("Salary is : "+ i.salary);
        System.out.println("Bonus is : "+ i.bonus);
    }
}
