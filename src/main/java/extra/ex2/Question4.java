package extra.ex2;

import java.util.Scanner;

public class Question4 {
    //Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
    //Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int number = scanner.nextInt();
        int result = 0;
        while (number / 10 != 0) {
            result += number % 10;
            number /= 10;
        }
        result += number;
        System.out.println("Tổng là: " + result);
    }
}
