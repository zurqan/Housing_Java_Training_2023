package session8.ocp;

import session8.ocp.repository.MongoUserRepo;
import session8.ocp.repository.MySQlUserRepo;
import session8.ocp.servioce.UserService;

public class Application {
    public static void main(String[] args) {

        UserService userService = new UserService(new MySQlUserRepo());
        UserService userService2 = new UserService(new MongoUserRepo());
    }
}
