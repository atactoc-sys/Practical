public class WithTmethod1{//class1
    int rollno;
    String name;
    float fee;
    //constructer
    WithTmethod1(int rollno, String name, float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    //method
    void display(){
        System.out.println(rollno+""+name+""+fee);
    }
    public class WithTmethod{//class2
        public static void main(String[]args){
            WithTmethod1 s1 = new WithTmethod1(111,"Arin",98000);
            WithTmethod1 s2 = new WithTmethod1(112,"Koushik",87000);
            s1.display();
            s2.display();
        }
    }
}
