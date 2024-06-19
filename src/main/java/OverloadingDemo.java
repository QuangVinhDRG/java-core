public class OverloadingDemo {
    public static void main(String[] args) {

    }

    // Mỗi phương thức có chữ kí là tên + danh sách các tham số (kiểu dữ liệu của danh sách)
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, byte b) {
        return a + b;
    }
}
