package generic;

public class GenericDemo {
    public static void main(String[] args) {
        // Quy ước
        // T - Type
        // N - Number
        // E - Element
        // K - Key
        // V - Value

        // Generic Class/Interface
        Dog<Integer> dog1 = new Dog<>("Long", 1);
        System.out.println("dog1 = " + dog1);
        Dog<Double> dog2 = new Dog<>("Hà", 2.5);
        System.out.println("dog2 = " + dog2);

        // Generic Method
        Printer.printAny(4);
        Printer.printAny(4.5);
        Printer.printAny(dog1);

        // Bounded Type: Giới hạn kiểu dữ liệu có thể nhận được
        // Dog<String> dog3 = new Dog<>("Tùng", "ABC");

        // Multiple Bound: 1 class đứng đầu, theo sau là interface
        int max = Math.max(1, 99);
        System.out.println("max = " + max);
    }
}
