package extra.ex2;

import java.util.Scanner;

public class Question7 {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int number = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: ", number);
        int count = 0;
        int temp = 2;
        while (count < number) {
            if (isPrime(temp)) {
                System.out.printf("%d ", temp);
                count++;
            }
            temp++;
        }
    }
}
