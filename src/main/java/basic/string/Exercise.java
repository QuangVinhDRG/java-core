package basic.string;

import java.util.Scanner;

public class Exercise {
    Scanner scanner = new Scanner(System.in);

    void question1() {
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();
        int count = 0;
        String[] words = s.split(" ");
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            } else {
                count++;
            }
        }
        System.out.printf("Số từ có trong chuỗi là: %d", count);
    }

    String question2() {
        System.out.print("Nhập chuỗi 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập chuỗi 2: ");
        String s2 = scanner.nextLine();
        return s1.concat(s2);
    }

    void question3() {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
    }
}
