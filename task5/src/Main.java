// Main.java
public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        // User selects "Windows"
        factory = new WindowsFactory();
        Button button = factory.createButton();
        Window window = factory.createWindow();

        button.paint();
        window.render();
    }
}
