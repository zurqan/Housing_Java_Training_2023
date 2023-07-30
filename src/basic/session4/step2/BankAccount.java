package basic.session4.step2;

public class BankAccount {

    String accountNo;

    private String name;

    public BankAccount(String name) {
        this.name = name;
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    double balance;

    public void setAccountNo(String accountNo){
        this.accountNo = accountNo;
    }
    public String getAccountNo(){
        return accountNo;
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

    public boolean withDraw(double amount ){
        if(amount>balance){
            return false;
        }
        this.balance-=amount;

        return true;
    }

}
