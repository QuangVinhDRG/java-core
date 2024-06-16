public class OperatorsDemo {
    public static void main(String[] args) {
        // Toán tử số học
        // +, -, *, /, %
        // Khi sử dụng phép toán số học trên 2 kiểu dữ liệu khác nhau thì trả về kiểu dữ liệu có miền lớn hơn (float > int)
        System.out.println(99 + 2);
        System.out.println(99 - 2);
        System.out.println(99 * 2);
        System.out.println(99 / 2);
        System.out.println(99.0 / 2);
        System.out.println(99 % 2);

        // +=, -=, *=, /=, %=
        int a = 100;
        a += 10; //a = a + 10;
        System.out.println("a = " + a);

        // ++, --
        int b = 1000;
        b++; // b += 1;
        System.out.println("b = " + b);
        // Chú ý: ++ đứng trước biến thì sẽ tăng giá trị biến rồi mới gán, ngược lại nếu ++ đứng sau thì sẽ gán trước rồi mới tăng giá trị biến
        int c = ++b;
        // b = b + 1;
        // int c = b;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        int d = b++;
        // int d = b;
        // b = b + 1;
        System.out.println("b = " + b);
        System.out.println("d = " + d);

        // Toán tử quan hệ
        // ==, > , >=, <, <=, !=

        // Toán tử logic
        // AND: &&
        // OR: ||
        // NOT: !
        boolean ok = b > 5 && b < 10;
        System.out.println("ok = " + ok);
        boolean notTrue = !true;
        System.out.println("notTrue = " + notTrue);

    }
}
