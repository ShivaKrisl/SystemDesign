package SystemDesign.LowLevelDesign.RepositoryPattern;

import SystemDesign.LowLevelDesign.RepositoryPattern.DALContext.InMemoryDbContext;
import SystemDesign.LowLevelDesign.RepositoryPattern.Repositories.IUserRepository;
import SystemDesign.LowLevelDesign.RepositoryPattern.Repositories.UserRepository;

// how to make it static
public class StartupConfig {
    private final IUserRepository userRepository;
    StartupConfig(){
        InMemoryDbContext dbContext = new InMemoryDbContext();
        userRepository = new UserRepository(dbContext);
    }

    public UserService getUserService(){
        UserService userService = new UserService(userRepository);
        return userService;
    } 

}
