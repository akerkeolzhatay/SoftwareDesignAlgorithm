import java.util.List;

// ViewModel class for managing user data
class UserViewModel {
    private final List<UserModel> users = new ArrayList<>();

    public void addUser(String name) {
        users.add(new UserModel(name));
    }

    public List<UserModel> getUsers() {
        return users;
    }
}