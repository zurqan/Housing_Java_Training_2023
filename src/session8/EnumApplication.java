package session8;

public class EnumApplication {

    public static void main(String[] args) {

        User user = new User("Mohammad", 40, "Amman", UserStatus.ACTIVE);

        System.out.println("user = " + user);

        for (UserStatus value : UserStatus
                .values()) {
            System.out.println("value = " + value);
        }

        System.out.println("UserStatus.ACTIVE.ordinal() = " + UserStatus.ACTIVE.ordinal());
        System.out.println("UserStatus.PENDING_REGISTRATION.ordinal() = " + UserStatus.PENDING_REGISTRATION.ordinal());

    }

    static class User{
        private final String name;
        private final int age;

        private final String address;

        private final UserStatus status;

        public User(String name, int age, String address, UserStatus status) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public UserStatus getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    ", status=" + status +
                    '}';
        }
    }
}
