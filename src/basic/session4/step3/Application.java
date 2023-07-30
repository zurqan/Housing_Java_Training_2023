package basic.session4.step3;


public class Application {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Ahmad","200.2");
        double balance = bankAccount.getBalance();
        System.out.println("balance = " + balance);

    }
}
