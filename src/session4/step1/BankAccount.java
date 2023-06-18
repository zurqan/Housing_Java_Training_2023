package session4.step1;

public class BankAccount {

//    public BankAccount() {
//        System.out.println("Creating object of bank account");
//    }

    String accountNo;

    String name;

    double balance;

    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    public String getAccountNo(){
        return accountNo;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

}
