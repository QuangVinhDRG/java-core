package extra.ex1;

import java.util.Scanner;

public class Question2 {
    //Viết chương trình nhập vào số giây từ 0 tới 68399, đổi số giây này thành dạng [giờ:phút:giây], mỗi thành phần là một số nguyên có 2 chữ số.
    //       Ví dụ: 02:11:05
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số giây: ");
        int second = scanner.nextInt();
        int hour = second / 3600;
        int minute = (second % 3600) / 60;
        int afterSecond = second % 60;
        System.out.printf("%s:%s:%s", (hour < 10 ? "0" + hour : hour), (minute < 10 ? "0" + minute : minute), (afterSecond < 10 ? "0" + afterSecond : afterSecond));
    }

}
