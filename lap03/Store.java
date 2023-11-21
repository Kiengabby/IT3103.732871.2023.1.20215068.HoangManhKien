import java.util.ArrayList;

public class Store {
    // Danh sách các đĩa DVD có sẵn trong cửa hàng
    ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();

    // Phương thức để loại bỏ một đĩa DVD từ cửa hàng
    public void removeDVD(DigitalVideoDisc disc) {
        itemsInStore.remove(disc);
        System.out.println("The disc " + disc.getTitle() + " has been removed");
    }

    // Phương thức để thêm một đĩa DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc disc) {
        itemsInStore.add(disc);
        System.out.println("The disc " + disc.getTitle() + " has been added");
    }
}
