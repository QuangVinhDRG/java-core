package extra.ex1;

import java.util.Scanner;

public class Question6 {
    // Xếp loại sinh viên theo các qui luật dưới đây:
    //
    //Nếu điểm >= 9.0 - Loại xuất sắc
    //Nếu 8.0<= điểm < 9.0 - Loại giỏi
    //Nếu 7.0<= điểm < 8.0 - Loại khá
    //Nếu 6.0 <= điểm < 7.0 - Loại trung bình khá
    //Nếu 5.0 <= điểm < 6.0 - Loại trung bình
    //Nếu điểm < 5.0 - Loại kém
    //Với điểm = ( (điểm toán)*2 + điểm lý + điểm hóa )/4
    //
    //Viết Chương trình:
    //a. Nhập vào điểm 3 môn học
    //b. Tính điểm trung bình
    //c. Xác định học lực của học sinh dựa trên điểm trung bình
    //d. Hiển thị học lực của học sinh
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm môn toán: ");
        double mathScore = scanner.nextDouble();
        System.out.print("Nhập điểm môn lý: ");
        double physicalScore = scanner.nextDouble();
        System.out.print("Nhập điểm môn hóa: ");
        double chemistryScore = scanner.nextDouble();
        double averageScore = (mathScore * 2 + physicalScore + chemistryScore) / 4;
        System.out.println("Điểm trung bình là: " + averageScore);
        if (averageScore >= 9) {
            System.out.println("Học lực: Xuất sắc");
        } else if (averageScore >= 8) {
            System.out.println("Học lực: Giỏi");
        } else if (averageScore >= 7) {
            System.out.println("Học lực: Khá");
        } else if (averageScore >= 6) {
            System.out.println("Học lực: Trung bình khá");
        } else if (averageScore >= 5) {
            System.out.println("Học lực: Trung bình");
        } else {
            System.out.println("Học lực: Kém");
        }
    }
}
