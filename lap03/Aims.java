public class Aims {
    public static void main(String[] args) {
        // Tạo một đơn hàng mới bằng cách tạo một đối tượng của lớp Carts
        Carts anOrderCart = new Carts();

        // Tạo các đối tượng DVD và thêm chúng vào giỏ hàng
        // DVD 1
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrderCart.addDigitalVideoDisc(dvd1);

        // DVD 2
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrderCart.addDigitalVideoDisc(dvd2);

        // DVD 3
        // Đối với DVD này, chỉ có tiêu đề và thể loại được cung cấp, không có thông tin khác
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 23.65f);
        anOrderCart.addDigitalVideoDisc(dvd3);

        // In ra tổng chi phí của giỏ hàng
        System.out.print("Total cost is: ");
        System.out.println(anOrderCart.totalCost());

        // In ra số lượng DVD trong giỏ hàng
        System.out.print("Dvd quantity in cart: ");
        System.out.println(anOrderCart.qtyOrdered);

        // In ra danh sách các DVD trong giỏ hàng
        anOrderCart.printCart();
    }
}