public class TestPassingParameter {
    public static void main(String[] args) {
        // Tạo đối tượng DVD "Jungle" và "Cinderella"
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        
        // Gọi phương thức swap và hiển thị tiêu đề của DVD sau khi hoán đổi
        newSwap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
        
        // Gọi phương thức changeTitle và hiển thị tiêu đề của DVD sau khi thay đổi tiêu đề
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    // Phương thức newSwap để hoán đổi thông tin giữa hai đối tượng DigitalVideoDisc
    public static void newSwap(DigitalVideoDisc Object1, DigitalVideoDisc Object2) {
        // Lưu trữ thông tin của Object1 vào các biến tạm thời
        String tempString = Object1.getTitle();
        String tempCategory = Object1.getCategory();
        String tempDirectory = Object1.getDirectory();
        int tempLength = Object1.getLength();
        float tempCost = Object1.getCost();
        
        // Gán thông tin từ Object2 vào Object1
        Object1.setTitle(Object2.getTitle());
        Object1.setCategory(Object2.getCategory());
        Object1.setDirectory(Object2.getDirectory());
        Object1.setLength(Object2.getLength());
        Object1.setCost(Object2.getCost());
        
        // Gán thông tin từ các biến tạm thời vào Object2
        Object2.setTitle(tempString);
        Object2.setCategory(tempCategory);
        Object2.setDirectory(tempDirectory);
        Object2.setLength(tempLength);
        Object2.setCost(tempCost);
    }

    // Phương thức changeTitle để thay đổi tiêu đề của một đối tượng DigitalVideoDisc
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        // Lưu tiêu đề cũ của DVD
        String oldTitle = dvd.getTitle();
        
        // Thay đổi tiêu đề của DVD thành tiêu đề mới
        dvd.setTitle(title);
        
        // Tạo một đối tượng DVD mới với tiêu đề cũ (không ảnh hưởng đến DVD đã truyền vào)
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
