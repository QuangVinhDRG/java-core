package encapsulation;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // a
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập quê quán sinh viên: ");
        String hometown = scanner.nextLine();
        Student student = new Student(name, hometown);
        System.out.println("--------------------------");

        // b
        System.out.print("Nhâp điểm sinh viên: ");
        student.setScore(Double.parseDouble(scanner.nextLine()));
        System.out.println("--------------------------");

        // c
        System.out.print("Nhập điểm muốn cộng thêm: ");
        student.addScore(Double.parseDouble(scanner.nextLine()));
        System.out.println("--------------------------");

        // d
        System.out.println("Thông tin sinh viên: ");
        student.showInfo();
        System.out.println("--------------------------");
    }
}
