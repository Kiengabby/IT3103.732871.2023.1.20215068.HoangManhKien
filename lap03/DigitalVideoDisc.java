import java.lang.String;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDisc = 0;
    private String title;
    private String category;
    private String directory;
    private int length;
    private float cost;
    public int id = nbDigitalVideoDisc;

    // Constructor to initialize DVD object with only title
    public DigitalVideoDisc(String title) {
        super();
        this.title = title;
        nbDigitalVideoDisc++;
    }

    // Constructor to initialize DVD object with title, category, and cost
    public DigitalVideoDisc(String title, String category, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDisc++;
    }

    // Constructor to initialize DVD object with title, category, directory, and cost
    public DigitalVideoDisc(String title, String category, String directory, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.directory = directory;
        this.cost = cost;
        nbDigitalVideoDisc++;
    }

    // Constructor to initialize DVD object with title, category, directory, length, and cost
    public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
        super();
        this.title = title;
        this.category = category;
        this.directory = directory;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDisc++;
    }

    // Getter methods for retrieving DVD information
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirectory() {
        return directory;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    // Setter methods to modify DVD information
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Override toString method to represent DVD information as a string
    
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + directory + " - "
                + length + ": " + cost + "$";
    }

    // Method to check if the provided title matches the DVD title
    public boolean isMatchTitle(String title1) {
        return this.getTitle().equals(title1);
    }
}
