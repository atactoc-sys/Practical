public class TestAccount {
    public static void main(String args[]) {
        Account obj = new Account();
        obj.setName("Saikat");
        obj.setEmail("saikait.mandi2013@gmail.com");
        obj.setAccountNumber(456987);
        obj.setBallance(100);
        System.out.println(obj.getName());
        System.out.println(obj.getEmail());
        System.out.println(obj.getAccountNumber());
        System.out.println(obj.getBallance());
        
    }
    
}
