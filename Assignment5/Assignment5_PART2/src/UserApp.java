// Main application class
public class UserApp {
    private final UserViewModel viewModel = new UserViewModel();
    private final UserView view = new UserView(viewModel);

    public static void main(String[] args) {
        new UserApp().run();
    }

    public void run() {
        while (true) {
            switch (view.showMenu()) {
                case 1 -> addUser();
                case 2 -> view.displayUsers();
                case 3 -> exitApp();
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void addUser() {
        viewModel.addUser(view.getUserNameInput());
        System.out.println("User added!");
    }

    private void exitApp() {
        System.out.println("Exiting...");
        System.exit(0);
    }
}