package extra.ex2;

import java.util.Scanner;

public class Question3 {
    //Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 .
    //In ra màn hình số lần xuất hiện của các phần tử.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của dãy: ");
        int quantity = scanner.nextInt();
        double[] numbers = new double[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (double number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        int count = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (i + 1 != numbers.length && numbers[i] == numbers[i + 1]) {
                count++;
            } else {
                System.out.printf("%f xuất hiện %d lần %n", numbers[i], count);
                count = 1;
            }
        }
    }
}
