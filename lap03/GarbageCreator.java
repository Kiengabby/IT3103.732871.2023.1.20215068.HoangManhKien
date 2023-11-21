import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String filename = "E:\\20231\\Lap trinh huong doi tuong\\Lab\\IT3103.732871.2023.1.20215068.HoangManhKien\\lab03\\text.txt";
        byte[] inputBytes;
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();

        // Sử dụng StringBuilder để tối ưu hóa việc nối chuỗi
        StringBuilder outputString = new StringBuilder();

        // Duyệt qua từng byte trong mảng inputBytes và chuyển thành ký tự, sau đó nối vào StringBuilder
        for (byte b : inputBytes) {
            outputString.append((char) b);
        }

        endTime = System.currentTimeMillis();
        System.out.println("Thời gian đọc và chuyển đổi là: " + (endTime - startTime) / 1000 + " giây");
    }
}
