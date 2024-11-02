// Class representing the data model, holding and managing data
class DataModel {
    private String data = "Initial Data"; // Initial data value

    // Returns the current data
    public String getData() {
        return data;
    }

    // Updates data with new input
    public void updateData(String newData) {
        this.data = newData;
    }

    // Appends additional data to the current data
    public void appendData(String moreData) {
        this.data += " | " + moreData;
    }
}