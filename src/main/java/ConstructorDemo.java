import entity.Dog;

public class ConstructorDemo {
    public static void main(String[] args) {
        // Constructor: Hàm khởi tạo
        // 1. Tên Constructor trùng với tên Class
        // 2. Constructor không có kiểu dữ liệu trả về
        // 3. Mặc định: không tham số

        Dog dog = new Dog("Long", 2);
        System.out.println("dog = " + dog);

        Dog dog2 = new Dog("Linh");
        System.out.println("dog2 = " + dog2);

        Dog dog3 = new Dog();
        System.out.println("dog3 = " + dog3);
    }
}
