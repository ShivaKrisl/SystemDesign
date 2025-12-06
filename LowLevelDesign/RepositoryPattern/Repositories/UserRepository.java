package SystemDesign.LowLevelDesign.RepositoryPattern.Repositories;

import java.util.List;

import SystemDesign.LowLevelDesign.RepositoryPattern.DALContext.InMemoryDbContext;

public class UserRepository implements IUserRepository {

    private final InMemoryDbContext dbContext;

    // Constructor
    public UserRepository(InMemoryDbContext dbContext) {
        this.dbContext = dbContext;
    }

    @Override
    public String addUser(String user) {
        String userAdded = dbContext.addUser(user);
        return userAdded;
    }   

    @Override
    public String getUserById(int id) {
        String user = dbContext.getUserById(id);
        return user;
    }

    @Override
    public List<String> fetchAllUsers() {
        return dbContext.getUsers();
    }
}
