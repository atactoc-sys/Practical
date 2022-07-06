package com;

public class Address {//class 1
    String city,state,country;
    public Address (String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;

    }
}


---------------------------------------------------------------------------------------------------------------------------------------------------------------



package com;

public class Student { //another class
    int id;
    String name;
    Address address;// aggregation  (entity ref of address class)
    public Student (int id, Address address, String name){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){// method
        System.out.println(id+" "+name);
        System.out.println(address.city=" "+address.state+" "+address.country);
    }
    public static void main (String args[]){
        Address address1 = new Address("dgp","wb","India");
        Address address2 = new Address("armbg","wb","India");
        Student s = new Student(12,address1,"daku");
        Student s2 = new Student(12,address2,"arin");
        s.display();
        s2.display();
    }
}

