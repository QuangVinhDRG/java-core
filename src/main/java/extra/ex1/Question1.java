package extra.ex1;

import java.util.Scanner;

public class Question1 {
    //Viết chương trình nhập vào một số thực. Đơn vị tính cho số này là centimet (cm).
    //Hãy in ra số tương đương tính bằng foot (số thực, có 2 số lẻ thập phân) và inch (số thực, có 2 số lẻ thập phân).
    //Với 1 inch = 2.54 cm và 1 foot = 12 inches.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số đo: ");
        double measure = scanner.nextDouble();
        double measureInch = measure / 2.54;
        double measureFoot = measureInch / 12;
        System.out.printf("%f cm = %.2f inch%n", measure, measureInch);
        System.out.printf("%f cm = %.2f foot", measure, measureFoot);
    }
}
