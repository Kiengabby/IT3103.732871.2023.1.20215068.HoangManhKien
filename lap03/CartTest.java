public class CartTest {
    public static void main(String[] args) {
        // Tạo một đối tượng Cart mới
        Carts cart = new Carts();

        // Tạo các đối tượng DVD mới và thêm chúng vào giỏ hàng
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        cart.addDigitalVideoDisc(dvd3);

        // In thông tin của giỏ hàng
        cart.printCart();

        // Tìm kiếm một đĩa dựa trên tiêu đề trong giỏ hàng
        cart.searchCartTitle();
    }
}
