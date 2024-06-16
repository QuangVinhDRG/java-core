public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue; // Quay lại vòng lặp ngay lập tức
            }
            System.out.println(i);
        }
    }
}
