public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Thoát khỏi vòng lặp ngay lập tức
            }
            System.out.println(i);
        }
    }
}
