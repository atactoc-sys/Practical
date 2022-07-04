public class Staticveriable1 {//CLASS 1
    int rollno;
    String name;
    static String college = "RERF";
    //CONSTRUCTER
    Staticveriable1( int r,String n){
        rollno = r;
        name = n;
    } 
    //METHOD
    void display(){
        System.out.println(rollno+""+name+""+college);
    }
    public class Staticveriable{//CLASS2
        public static void main(String []args){
            //OBJECT
            Staticveriable1 s1 = new Staticveriable1(010,"Arin");
            Staticveriable1 s2 = new Staticveriable1(011,"Koushik");
            s1.display();
            s2.display();
        }
    }   
}
