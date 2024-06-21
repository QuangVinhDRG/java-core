import java.io.File;
import java.io.IOException;

public class FileManager {
    public static boolean createNewFile(String path) throws IOException {
        File file = new File(path); // File đại diện cho cả tệp tin và thư mục
        return file.createNewFile(); // Tạo file
    }

    public static boolean exists(String path) {
        File file = new File(path);
        return file.exists(); // Kiểm tra xem có tồn tại file trong đường dẫn không
    }

    public static boolean isFile(String path) {
        File file = new File(path);
        return file.isFile(); // Kiểm tra xem phải tệp tin không
    }

    public static boolean isDirectory(String path) {
        File file = new File(path);
        return file.isDirectory(); // Kiểm tra xem phải thư mục không
    }

    public static String[] list(String path) {
        File file = new File(path);
        return file.list(); // Liệt kê các file trong thư mục
    }

    public static boolean detele(String path) {
        File file = new File(path);
        return file.delete(); // Xóa file
    }

    public static boolean mkdirs(String path) {
        File file = new File(path);
        return file.mkdirs(); // Tạo thư mục (nhiều thư mục lồng nhau cùng lúc)
    }

    public static boolean moveTo(String source, String destination) {
        File from = new File(source);
        File to = new File(destination);
        return from.renameTo(to); // đổi tên hoặc di chuyển file
    }
}
