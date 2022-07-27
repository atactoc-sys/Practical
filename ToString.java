package String;

public class ToString {
    int rollno;
    String name,addr;
    ToString(int rollno, String name, String addr){
        this.rollno=rollno;
        this.name=name;
        this.addr=addr;
    }
    public String toString(){
        return super.toString();
    }

    public static void main(String arrgs[]){
        ToString s1 = new ToString(1,"Daku","Arqambagh");
        ToString s2 = new ToString(2,"Arin","Sultanpur");
        System.out.println(s1);
        System.out.println(s2);
    }
}
