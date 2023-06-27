package session8.ocp_notvalid.service;

import session8.ocp_notvalid.model.User;
import session8.ocp_notvalid.repository.MySQLRepo;

public class UserService {

    private final MySQLRepo repo;

    public UserService(MySQLRepo repo) {
        this.repo = repo;
    }

    public void registerUser(User user){
        //first validate
        //......
        //check x
        //communicate with gov servcie to validate national id

        //save

        repo.save(user);
    }
}
