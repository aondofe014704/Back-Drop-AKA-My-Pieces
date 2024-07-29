package NewPackageForNewAccount;

public class VipPerson {
    private String name;
    private int creditLimit;
    private String emailAddress;


public VipPerson(){
    this.name = "wizzy";
    this.creditLimit = 0;
    this.emailAddress = "Wizzy@gmail.com";
}
    public VipPerson(String name, String emailAddress ){
    this.name = name;
    this.emailAddress = emailAddress;

}
    public VipPerson(String name, int creditLimit, String emailAddress) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.emailAddress = emailAddress;
}
public String getName(){
    return this.name = name;
}
public int getCreditLimit(){
    return this.creditLimit = creditLimit;
}
public String getEmailAddress(){
    return this.emailAddress = emailAddress;
}

}
