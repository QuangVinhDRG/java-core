package encapsulation;

public class EncapsulationDemo {
    // Tính đóng gói: Che dấu thông tin
    // 1. Private các thuộc tính
    // 2. Cung cấp getter/setter
    public static void main(String[] args) {
        Cat cat = new Cat("Long", 2);
        System.out.println("cat.getName() = " + cat.getName());
    }
}
