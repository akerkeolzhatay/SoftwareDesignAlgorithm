// Class that coordinates the model and view, handling program flow
class DataPresenter {
    private final DataModel model;
    private final ConsoleView view;

    // Constructor to initialize model and view
    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    // Main logic for displaying, updating, and appending data
    public void run() {
        // Display the initial data
        view.displayData("Current Data: ", model.getData());

        // Get new data from the user, update the model, and display it
        model.updateData(view.getInput("Enter new data: "));
        view.displayData("Data updated to: ", model.getData());

        // Get additional data from the user, append it, and display the final data
        model.appendData(view.getInput("Enter another piece of data: "));
        view.displayData("Final combined data: ", model.getData());
    }
}