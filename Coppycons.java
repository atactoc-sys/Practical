public class Coppycons {
    private String name;
    private double marks;
    Coppycons(String name, double marks){
        this.name=name;
        this.marks=marks;
    }
    Coppycons (Coppycons c)
    {
        this.name=c.getName();
        this.marks=c.getMarks();

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getMarks(){
        return marks;
    }
    public void setMarks(double marks){
        this.marks=marks;
    }
}
