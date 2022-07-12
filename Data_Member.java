public class Data_Member {
    int CarSpeed = 80;
}
class Dc extends Data_Member{
    int CarSpeed = 90;
    public static void main(String args[]){
        Dc obj = new Dc();
        System.out.println(obj.CarSpeed);
    }
}
