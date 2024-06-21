package inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    Scanner scanner = new Scanner(System.in);
    List<CanBo> canBoList = new ArrayList<>();

    public void themMoiCanBo() {
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        System.out.println("--> Chọn loại cán bộ: ");
        int selection = Integer.parseInt(scanner.nextLine());
        System.out.print("- Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("- Nhập tuổi: ");
        int tuoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Chọn giới tính: ");
        System.out.println("1. Nam");
        System.out.println("2. Nữ");
        System.out.println("3. Khác");
        GioiTinh gioiTinh = null;
        int genderSelection = Integer.parseInt(scanner.nextLine());
        if (genderSelection == 1) {
            gioiTinh = GioiTinh.NAM;
        } else if (genderSelection == 2) {
            gioiTinh = GioiTinh.NU;
        } else if (genderSelection == 3) {
            gioiTinh = GioiTinh.KHAC;
        }
        System.out.print("Nhập địa chỉ: ");
        String diaChi = scanner.nextLine();
        switch (selection) {
            case 1:
                CongNhan congNhan = new CongNhan();
                congNhan.setHoTen(hoTen);
                congNhan.setTuoi(tuoi);
                congNhan.setGioiTinh(gioiTinh);
                congNhan.setDiaChi(diaChi);
                System.out.print("Nhập bậc công nhân (từ 1 đến 10): ");
                congNhan.setBac(Integer.parseInt(scanner.nextLine()));
                CanBo canBo = congNhan;
                canBoList.add(canBo);
                break;
            case 2:
                KySu kySu = new KySu();
                kySu.setHoTen(hoTen);
                kySu.setTuoi(tuoi);
                kySu.setGioiTinh(gioiTinh);
                kySu.setDiaChi(diaChi);
                
                break;
        }
    }

    public static void main(String[] args) {

    }
}
