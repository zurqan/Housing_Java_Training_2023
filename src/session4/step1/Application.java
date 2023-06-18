package session4.step1;

public class Application {

    public static void main(String[] args) {
        String a = new String("Mohammad");
        BankAccount mohammadAccount= new BankAccount();
        mohammadAccount.setAccountNo("AC1234");
        mohammadAccount.setName("Mohammad");
        System.out.println("mohammadAccount.getBalance() = " + mohammadAccount.getBalance());

        System.out.println("mohammadAccount.getName() = " + mohammadAccount.getName());

        BankAccount jawadAccount= new BankAccount();
        jawadAccount.setAccountNo("AC2005");
        jawadAccount.setName("Jawad");
        System.out.println("jawadAccount.getName() = " + jawadAccount.getName());

        System.out.println("jawadAccount.getBalance() = " + jawadAccount.getBalance());

        jawadAccount.deposit(10.5);
        System.out.println("jawadAccount.getBalance() = " + jawadAccount.getBalance());
        jawadAccount.deposit(20);
        System.out.println("jawadAccount.getBalance() = " + jawadAccount.getBalance());

    }
}
