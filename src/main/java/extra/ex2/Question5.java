package extra.ex2;

import java.util.Scanner;

public class Question5 {

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
        int devideNumber = 2;
        System.out.printf("%d = ", number);
        int count = 1;
        while (devideNumber <= number) {
            if (isPrime(devideNumber)) {
                if (number % devideNumber == 0) {
                    if (count == 1) {
                        System.out.print(devideNumber);
                        count++;
                    } else {
                        System.out.printf(" x %d", devideNumber);
                    }
                    number /= devideNumber;
                } else {
                    devideNumber++;
                }
            } else {
                devideNumber++;
            }
        }
    }
}
