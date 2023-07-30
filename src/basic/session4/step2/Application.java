package basic.session4.step2;

public class Application {

    public static void main(String[] args) {
        BankAccount mosaAccount = new BankAccount("Mosa");
        boolean isSuccess = mosaAccount.withDraw(10);
        System.out.println("isSuccess = " + isSuccess);
        mosaAccount.deposit(100);
        boolean isSecondAttemptSucceeded = mosaAccount.withDraw(10);
        System.out.println("isSecondAttemptSucceeded = " + isSecondAttemptSucceeded);

        BankAccount ahmadAccount = new BankAccount("Ahmad",100);
        System.out.println("ahmadAccount.getBalance() = " + ahmadAccount.getBalance());

    }
}
