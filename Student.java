package Stream;

//WRITING STATE OF AN OBJECT INTO BYTE STREAM

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    transient int fees;// USE WITHDETA MEMBER OF CLASS IN OIRDER TO AAVOID SERIALIZATION

    public Student(int id, String name, int fees) {
        this.id = id;
        this.name = name;
        this.fees = fees;
    }

    public static void main(String[] args) {

    }
}
