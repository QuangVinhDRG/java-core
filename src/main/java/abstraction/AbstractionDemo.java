package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // Tính trừu tượng

        // Abstract class: trừu tượng không hoàn toàn (< 100%), để những các chung
        // Abstract class không thể khởi tạo đối tượng.
        Circle circle = new Circle(1);
        System.out.println("circle.area() = " + circle.area());

        // Interface: trừu tượng hoàn toàn (100%), tên kế thừa là tính từ (able), để những cái riêng
        // Mặc định: public abstract
        // Đa kế thừa
        circle.draw();
        circle.extend();

    }
}
