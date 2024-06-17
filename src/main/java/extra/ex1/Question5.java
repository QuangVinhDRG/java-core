package extra.ex1;

import java.util.Scanner;

public class Question5 {
    //Nhập vào 2 số tự nhiên a và b. Kiểm tra xem a có chia hết cho b không
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int secondNumber = scanner.nextInt();
        System.out.println(firstNumber % secondNumber == 0 ? firstNumber + " chia hết cho " + secondNumber : firstNumber + " không chia hết cho " + secondNumber);
    }
}
