
// Main class to run the application
public class Main {
    public static void main(String[] args) {
        // Initialize the model, view, and presenter
        DataModel model = new DataModel();
        ConsoleView view = new ConsoleView();
        DataPresenter presenter = new DataPresenter(model, view);

        // Start the main program flow
        presenter.run();
    }
}