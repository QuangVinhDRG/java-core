public class DebugDemo {
    public static void main(String[] args) {
        System.out.println("Main 1");
        System.out.println("Main 2");
        System.out.println("Main 3");
        loop();
        System.out.println("Main 4");
        System.out.println("Main 5");
        System.out.println("Main 6");
    }

    public static void loop() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
