package gc;

public class GCDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Long");
        Dog dog2 = new Dog("Linh");
        dog2 = null; // Thu hồi khi mất tham chiếu
        System.gc();

        demo();
        System.gc(); // Thu hồi khi không dùng biến
    }

    public static void demo() {
        Dog dog = new Dog("ABC");
    }
}
