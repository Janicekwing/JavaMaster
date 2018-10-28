public class VipCustomer{
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer(String name, int creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(){
        this("Janice", 2000, "jbu@edu");
    }

    public VipCustomer(int creditLimit, String emailAddress){
        this("Janice", creditLimit, emailAddress);
    }

    public String getName(){
        return this.name;
    }
    public int getCreditLimit(){
        return this.creditLimit;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }



} 