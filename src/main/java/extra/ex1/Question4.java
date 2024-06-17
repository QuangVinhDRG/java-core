package extra.ex1;

import java.util.Scanner;

public class Question4 {
    //Nhập vào hai số tự nhiên a và b. Tính hiệu của hai số đó.
    //Nếu hiệu số lớn hơn 0 thì in ra dòng chữ [Số thứ nhất lớn hơn số thứ hai].
    //Nếu hiệu số nhỏ hơn 0 thì in ra dòng chữ [Số thứ nhất nhỏ hơn số thứ hai].
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int secondNumber = scanner.nextInt();
        System.out.printf("Hiệu hai số: %d\n[%s]", firstNumber - secondNumber, (firstNumber - secondNumber > 0 ? "Số thứ nhất lớn hơn số thứ hai" : "Số thứ nhất nhỏ hơn số thứ hai"));
    }
}
