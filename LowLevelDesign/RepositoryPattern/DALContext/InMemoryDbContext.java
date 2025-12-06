package SystemDesign.LowLevelDesign.RepositoryPattern.DALContext;

import java.util.List;

public class InMemoryDbContext {
    private List<String> users;
    
    private void seedingData(){
        for(int i=1; i<=1000; i++){
            users.add("User" + i);
        }
    }

    // Constructor
    public InMemoryDbContext() {
        users = new java.util.ArrayList<>();
        seedingData();
    }

    public List<String> getUsers() {
        return users;
    }

    public String addUser(String user) {
        this.users.add(user);
        return user;
    }

    public String getUserById(int id){
        if(id <= 0 || id > users.size()){
            return null;
        }
        return users.get(id - 1);
    }

}
