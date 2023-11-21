public class StoreTest {
    public static void main(String[] args) {
        // Tạo một đối tượng Store để quản lý DVD
        Store dvdStore = new Store();

        // Tạo đối tượng DVD và thêm vào cửa hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        dvdStore.addDVD(dvd1);

        // Tạo đối tượng DVD khác và thêm vào cửa hàng
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        dvdStore.addDVD(dvd2);

        // Tạo đối tượng DVD thứ ba và thêm vào cửa hàng
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 23.65f);
        dvdStore.addDVD(dvd3);

        // Loại bỏ một DVD từ cửa hàng DVD
        dvdStore.removeDVD(dvd3);
    }
}
