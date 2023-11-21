import java.util.ArrayList;
import java.util.Scanner;

public class Carts {

    // Số lượng tối đa các sản phẩm có thể đặt hàng
    public static final int MAX_NUMBERS_ORDERED = 20;
    private float totalCost = 0;
    ArrayList<DigitalVideoDisc> itemsOrderedList = new ArrayList<DigitalVideoDisc>(MAX_NUMBERS_ORDERED);

    public int qtyOrdered = 0;

    // Phương thức để loại bỏ một đĩa khỏi giỏ hàng
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        itemsOrderedList.remove(disc);
        System.out.println("The disc " + disc.getTitle() + " has been removed");
        qtyOrdered = itemsOrderedList.size();
    }

    // Phương thức để thêm một đĩa vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrderedList.add(disc);
            System.out.println("The disc " + disc.getTitle() + " has been added");
            qtyOrdered = itemsOrderedList.size();

            System.out.println("ID: " + disc.id);
        } else {
            System.out.println("The cart is almost full");
        }
    }

    // Phương thức để thêm một danh sách đĩa vào giỏ hàng
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (int i = 0; i < dvdList.length; i++) {
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrderedList.add(dvdList[i]);
                System.out.println("The disc " + dvdList[i].getTitle() + " has been added");
                qtyOrdered = itemsOrderedList.size();
            } else {
                System.out.println("The cart is almost full");
            }
        }
    }

    // Phương thức tính tổng chi phí của các sản phẩm trong giỏ hàng
    public float totalCost() {
        for (int i = 0; i < itemsOrderedList.size(); i++) {
            totalCost += itemsOrderedList.get(i).getCost();
        }
        return totalCost;
    }

    // Phương thức in ra thông tin của giỏ hàng
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        if (!itemsOrderedList.isEmpty()) {
            System.out.println("1. " + itemsOrderedList.get(0).toString());
            for (int i = 1; i < itemsOrderedList.size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " + itemsOrderedList.get(i).toString());
            }
        } else {
            System.out.println("No items in the cart.");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    // Phương thức để tìm kiếm sản phẩm trong giỏ hàng dựa trên ID
    public void searchCartId() {
        int id, count = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input ID: ");
        id = keyboard.nextInt();
        for (int i = 0; i < itemsOrderedList.size(); i++) {
            if (id == itemsOrderedList.get(i).id) {
                System.out.println(itemsOrderedList.get(i).toString());
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Don't found this title in your cart!");
        }
    }

    // Phương thức để tìm kiếm sản phẩm trong giỏ hàng dựa trên tiêu đề
    public void searchCartTitle() {
        String title;
        int count = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input title: ");
        title = keyboard.nextLine();
        for (int i = 0; i < itemsOrderedList.size(); i++) {
            if (itemsOrderedList.get(i).isMatchTitle(title)) {
                System.out.println(itemsOrderedList.get(i).toString());
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Don't found this title in your cart!");
        }
    }
}
