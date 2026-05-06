package tp3;
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ahmed", 1000.0);
        
        account.deposit(500.0);
        account.withdraw(200.0);
        
        account.setOwnerName("Ahmed Ali");
        account.setBalance(1500.0);
        
        System.out.println(account.toString());
    }
}