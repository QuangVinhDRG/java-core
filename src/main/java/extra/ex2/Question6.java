package extra.ex2;

import java.util.Scanner;

public class Question6 {
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
        if (number <= 1) {
            System.out.println("Không có số nguyên tố thỏa mãn");
        } else {
            int count = 1;
            System.out.printf("Số nguyên tố nhỏ hơn %d: ", number);
            for (int i = 2; i < number; i++) {
                if (isPrime(i)) {
                    if (count == 1) {
                        System.out.printf("%d", i);
                        count++;
                    } else {
                        System.out.printf(", %d", i);
                    }
                }
            }
        }
    }
}
