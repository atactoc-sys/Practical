public class Address {
    String city, state, country; 
    public Address (String city,String Stte,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}



public class Student {
    int id;
    String name;
    Address address;
    public Student(int id, String name, Address address){
        this.id=id;
        this.name = name;
        this.address=address;
    }
    void disaplay(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }
    public static void name(String args[]) {
        Address address1=new Address("dgp","wb","India");
        Address address2=new Address("kol","wb","India");
        Student s1 = new Student("12",'daku',address1);
        Student s2 = new Student("13","ammy",address2);
        s1.disaplay();
        s2.disaplay();
    }
}
