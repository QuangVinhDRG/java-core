public class FinalDemo {
    public static void main(String[] args) {
        // final property: không cho phép thay đổi giá trị sau khi khai báo/gán lần đầu
        final double pi = 3.1415;

        // final method: ngăn không cho phép lớp con ghi đè
        Dog dog = new Dog();
        dog.run();

        // final class: không class nào có thể kế thừa class đó (class không có con)


        // constant: một số có giá trị không đổi (PI,...)
        System.out.println("Math.PI = " + Math.PI);

    }
}
