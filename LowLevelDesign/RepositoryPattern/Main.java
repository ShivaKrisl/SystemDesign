package SystemDesign.LowLevelDesign.RepositoryPattern;

public class Main {
    public static void main(String[] args) {
        
        StartupConfig startupConfig = new StartupConfig();
        UserService userService = startupConfig.getUserService();

        // Add a new user
        String newUser = "NewUser1";
        userService.addUser(newUser);
        System.out.println("Added User: " + newUser);

        // Get user by ID
        int userIdToFetch = 1001; // Since we seeded 1000 users, the new user will be at index 1001
        String fetchedUser = userService.getUserById(userIdToFetch);
        System.out.println("Fetched User by ID " + userIdToFetch + ": " + fetchedUser);

        // Fetch all users
        java.util.List<String> allUsers = userService.fetchAllUsers();
        System.out.println("Total Users: " + allUsers.size());

    }
}
