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

    String question3() {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        if (Character.isUpperCase(name.charAt(0))) {
            return name = name.toUpperCase();
        }
        return name;
    }

    void question4() {
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.printf("Ký tự thứ %d là: %s\n", i, Character.toUpperCase(name.charAt(i)));
        }
    }

    void question5() {
        System.out.print("Nhập họ: ");
        String firstName = scanner.nextLine();
        System.out.print("Nhập tên: ");
        String lastName = scanner.nextLine();
        System.out.printf("Họ và tên: %s", firstName.concat(" " + lastName));
    }

    void question6() {
        System.out.print("Nhập họ tên: ");
        String fullName = scanner.nextLine();
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.lastIndexOf(" ") + 1);
        String middleName = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        System.out.printf("Họ: %s\n", firstName);
        System.out.printf("Tên đệm: %s\n", middleName);
        System.out.printf("Tên: %s\n", lastName);
    }

    void question7() {
        System.out.print("Nhập họ tên: ");
        String fullName = scanner.nextLine();
        String[] nameParts = fullName.split(" ");
        String standardName = "";
        for (String namePart : nameParts) {
            if (namePart.isEmpty()) {
                continue;
            } else {
                String firstLetter = String.valueOf(namePart.charAt(0)).toUpperCase();
                namePart = firstLetter.concat(namePart.substring(1).toLowerCase());
                standardName = standardName.concat(namePart + " ");
            }
        }
        standardName = standardName.trim();
        System.out.printf("Họ tên đã chuẩn hóa: %s", standardName);
    }

    void question8() {

    }

    void question9() {

    }

    void question10() {
        System.out.print("Nhập chuỗi 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Nhập chuỗi 2: ");
        String s2 = scanner.nextLine();
        String[] arrayS1 = s1.split("");
        String s1Reverse = "";
        for (int i = arrayS1.length - 1; i >= 0; i--) {
            s1Reverse = s1Reverse.concat(arrayS1[i]);
        }
        System.out.printf(s1Reverse.equals(s2) ? "%s và %s là hai chuỗi đảo ngược của nhau" : "%s và %s không là hai chuỗi đảo ngược của nhau", s1, s2);
    }

    void question11() {
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine().toLowerCase();
        System.out.print("Nhập ký tự cần kiểm tra: ");
        String letter = scanner.nextLine().toLowerCase();
        String[] arrayS = s.split("");
        int count = 0;
        for (String item : arrayS) {
            if (item.equals(letter)) {
                count++;
            }
        }
        System.out.printf("Số lần xuất hiện kí tự %s trong chuỗi là: %d", letter, count);
    }

    void question12() {
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();
        String[] arrayS = s.split("");
        String sReverse = "";
        for (int i = arrayS.length - 1; i >= 0; i--) {
            sReverse = sReverse.concat(arrayS[i]);
        }
        System.out.println("Chuỗi đảo ngược: " + sReverse);
    }

    boolean question13() {
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();
        if (s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    void question14() {
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();
        System.out.print("Nhập kí tự muốn chuyển đổi: ");
        String transformLetter = scanner.nextLine();
        System.out.print("Nhập kí tự chuyển đổi: ");
        char targetLetter = scanner.nextLine().charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(transformLetter)) {
                s = s.replace(s.charAt(i), targetLetter);
            }
        }
        System.out.println("Chuỗi sau khi chuyển đổi: " + s);
    }

    void question15() {

        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();
        s = s.trim();
        String[] words = s.split(" ");
        String revertByWord = "";
        for (int i = words.length - 1; i >= 0; i--) {
            revertByWord = revertByWord.concat(words[i] + " ");
        }
        revertByWord = revertByWord.trim();
        System.out.println("Kết quả: " + revertByWord);
    }

    void question16() {
        System.out.print("Nhập chuỗi: ");
        String s = scanner.nextLine();
        s = s.trim();
        System.out.print("Nhập số nguyên: ");
        int number = scanner.nextInt();
        if (s.length() % number != 0) {
            System.out.println("KO");
        } else {
            String resultString = "";
            for (int i = 0; i < s.length(); i += number) {
                resultString = resultString.concat(s.substring(i, i + number) + " ");
            }
            resultString = resultString.trim();
            System.out.println("Kết quả: " + resultString);
        }
    }
}
