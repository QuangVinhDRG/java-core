package extra.ex2;

import java.util.Scanner;

public class Question1 {
    // Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 .
    //Hãy liệt kê các phần tử xuất hiện trong dãy đúng một lần
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của dãy: ");
        int quantity = scanner.nextInt();
        double[] numbers = new double[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        for (double number : numbers) {
            int count = 0;
            for (double checkNumber : numbers) {
                if (number == checkNumber) {
                    count++;
                }
                if (count > 1) {
                    break;
                }
            }
            if (count == 1) {
                System.out.print("Số phần tử xuất hiện 1 lần: " + number + " ");
            }
        }
    }
}
