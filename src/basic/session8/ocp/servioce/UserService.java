package basic.session8.ocp.servioce;


import basic.session8.ocp.model.User;

public class UserService {

    private final UserRepo repo;

    public UserService(UserRepo repo) {
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
