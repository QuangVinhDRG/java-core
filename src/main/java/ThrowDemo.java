public class ThrowDemo {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) { // throw: chủ động ném ra ngoại lệ
                throw new IllegalStateException("Bạn chưa đủ 18 tuổi"); // Trạng thái không hợp lệ
            } else {
                System.out.println("Chào mừng bạn...");
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
