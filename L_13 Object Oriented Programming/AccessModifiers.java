public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.username = "Tharun";
        acc.setPassword("1234");

        System.out.println("Account Name: "+acc.username);
        //System.out.println("Account Password: "+acc.password);
        // private variable cannot be accessed outside class
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword (String password){
        this.password = password;
    }
}