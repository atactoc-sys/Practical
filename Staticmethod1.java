public class Staticmethod1 {//CLASS 1
    int rollno;
    String name;
    static String college = "RERF";
    static void change(){
        college = "NSPC";
    }
    //CONSTRUCTER
    Staticmethod1( int r,String n){
        rollno = r;
        name = n;
    } 
    //METHOD
    void display(){
        System.out.println(rollno+""+name+""+college);
    }
    public class Staticmethod{//CLASS2
        public static void main(String []args){
            Staticmethod1.change();
            //OBJECTs
            Staticmethod1 s1 = new Staticmethod1(123,"Arin");
            Staticmethod1 s2 = new Staticmethod1(011,"Koushik");
            s1.display();
            s2.display();
        }
    }   
}

