package extra.ex1;

import java.util.Scanner;

public class Question3 {
    //Viết chương trình nhập vào 4 số nguyên.
    //Hiển thị ra số lớn nhất và nhỏ nhất
    //Ví dụ:
    //       Nhập vào 4 số 1,2,3,4 thì kết quả là:
    //Số lớn nhất là: 4
    //Số nhỏ nhất là: 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);
    }
}
