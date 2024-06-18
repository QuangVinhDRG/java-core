package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Tính kế thừa Tái sử dụng code
        // Từ khóa: extends
        Duck duck = new Duck("Long", 2);
        duck.eat();
        System.out.println("duck = " + duck);

        // @Override
        // Từ khóa: super
        // Đơn kế thừa
    }
}
