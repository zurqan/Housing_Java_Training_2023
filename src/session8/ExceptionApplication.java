package session8;

public class ExceptionApplication {

    public static void main(String[] args) {

//        System.out.println(5/0);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
        }


        UserRecord userRecord = new UserRecord("Mohammad", 40, "Amman", UserStatus.ACTIVE);

    }


    public class UserNotFoundException extends Exception{

    }

    static record UserRecord(String name,int age,String address,UserStatus status){};
}
