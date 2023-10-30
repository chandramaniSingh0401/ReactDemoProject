import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private List<User> users; // Simulating a database with a list

    public UserDao() {
        users = new ArrayList<>();
    }

    // Create a new user
    public void createUser(User user) {
        users.add(user);
    }

    // Read a user by ID
    public User getUserById(int userId) {
        for (User user : users) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null; // User not found
    }

    // Update an existing user
    public void updateUser(User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getId() == updatedUser.getId()) {
                users.set(i, updatedUser);
                return;
            }
        }
    }

    // Delete a user
    public void deleteUser(int userId) {
        users.removeIf(user -> user.getId() == userId);
    }

    // Retrieve a list of all users
    public List<User> getAllUsers() {
        return users;
    }
}
