import java.io.IOException;

public class ThrowsDemo {
    public static void main(String[] args) {
        // Throws (có s): Lan truyền ngoại lệ
        try {
            String content = readFile();
            System.out.println(content);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Thằng nào gọi phải xử lý ngoại lệ IOException
    public static String readFile() throws IOException { // Lan truyền ngoại lệ đến những thằng gọi nó
        throw new IOException("File không tồn tại"); // đây là loại checked exception, bắt buộc phải bắt ngoại lệ

    }
}
