package SystemDesign.LowLevelDesign.RepositoryPattern.Repositories;

import java.util.List;

public interface IUserRepository {
    
    public String addUser(String user);

    public String getUserById(int id);

    public List<String> fetchAllUsers();

}
