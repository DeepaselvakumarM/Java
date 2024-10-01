class Account{
    String UserName;
    private int AccountNbr;
    private double balance;
    public Account(String UserName,int AccountNbr,double balance){
        this.UserName=UserName;
        this.AccountNbr=AccountNbr;
        this.balance=balance;
    }
    public String getUserName(){
        return UserName;
    }
    public int setAccountNbr(int AccountNbr){
        if(AccountNbr.length()>13){
            this.AccountNbr=11111;
            System.out.println("Provide valid account ");
        }
        else{}
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }
    public void deposit(double amount)
    {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
        
    }
}
public class Encaps {
    public static void main(String[] args) {
        Account a=new Account("John Doe", 1023100,1000);
        a.deposit(100);
        a.getUserName();
    }
}
