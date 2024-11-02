import java.util.Scanner;

// Class responsible for user interaction in the console
class ConsoleView {
    private final Scanner scanner = new Scanner(System.in);

    // Method to display data with a custom label
    public void displayData(String label, String data) {
        System.out.println(label + data);
    }

    // Method to prompt the user and get input
    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}