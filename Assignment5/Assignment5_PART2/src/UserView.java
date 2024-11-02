import java.util.Scanner;

// View class for interacting with the user
class UserView {
    private final Scanner scanner = new Scanner(System.in);
    private final UserViewModel viewModel;

    public UserView(UserViewModel viewModel) {
        this.viewModel = viewModel;
    }

    public int showMenu() {
        System.out.println("1. Add user\n2. Display users\n3. Exit");
        System.out.print("Choose an option: ");
        return scanner.nextInt();
    }

    public String getUserNameInput() {
        System.out.print("Enter user name: ");
        scanner.nextLine(); // Consume leftover newline
        return scanner.nextLine();
    }

    public void displayUsers() {
        System.out.println("User List:");
        viewModel.getUsers().forEach(user -> System.out.println("- " + user.getName()));
    }
}