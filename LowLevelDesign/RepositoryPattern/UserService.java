package SystemDesign.LowLevelDesign.RepositoryPattern;

import SystemDesign.LowLevelDesign.RepositoryPattern.Repositories.IUserRepository;

public class UserService {

    private final IUserRepository userRepository;

    UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String addUser(String user) {
        return userRepository.addUser(user);
    }

    public String getUserById(int id) {
        return userRepository.getUserById(id);
    }

    public java.util.List<String> fetchAllUsers() {
        return userRepository.fetchAllUsers();
    }
}
