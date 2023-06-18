package session4.step3;

import java.math.BigDecimal;

public class BankAccount {

    String accountNo;

    private String name;

    BigDecimal balance;

    public BankAccount(String name) {
        this.name = name;
    }

    public BankAccount(String name, String balance) {
        this.name = name;
        this.balance = new BigDecimal(balance);
    }

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
        return balance.doubleValue();
    }

    public void deposit(String amount){
        this.balance.add(new BigDecimal(amount));
    }

    public boolean withDraw(String amount ){
        BigDecimal bigAmount= new BigDecimal(amount);
        if(this.balance.doubleValue()<bigAmount.doubleValue()){
            return false;
        }
        this.balance.subtract(bigAmount);

        return true;
    }

}
