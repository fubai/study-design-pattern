public class Main {

    public static void main(String[] args) {

        Business business1 = new SMSBusiness().createBusiness();
        Business business2 = new EmailBusiness().createBusiness();
        System.out.println(business1);
        System.out.println(business2);
    }
}
