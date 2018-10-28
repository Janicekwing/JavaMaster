public class Main{
    public static void main(String[] args)
    {
        Account janicesAccount = new Account();
        janicesAccount.deposit(900);
        janicesAccount.withdraw(80);

        VipCustomer janice = new VipCustomer(200, "keester@bu.edu");
        System.out.println(janice.getEmailAddress() + janice.getName() + janice.getCreditLimit());
    }

}