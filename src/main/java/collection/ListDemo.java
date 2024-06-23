package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
//        List<String> students = new ArrayList<>(); // Dùng khi cần truy cập O(1) nhiều hơn xóa O(n)
        List<String> students = new LinkedList<>(); // Dùng khi cần xóa O(1) nhiều hơn truy cập O(n)

        students.add("Long"); // Thêm vào cuối danh sách
        // ["Long"]
        students.add("Huy");
        // ["Long", "Huy"]
        students.add(0, "Đạt");
        // ["Đạt", "Long", "Huy"]

        System.out.println("students.size() = " + students.size()); // Lấy kích thước của list
        // 3

        students.isEmpty(); // Kiểm tra list có rỗng không
        // False

        System.out.println("students.get(0) = " + students.get(0)); // Lấy giá trị theo chỉ số
        // Đạt

        System.out.println("students.indexOf(\"Đạt\") = " + students.indexOf("Đạt")); // Lấy chỉ số theo giá trị
        // 0

        System.out.println("students.contains(\"Hà\") = " + students.contains("Hà")); // Kiểm tra chuỗi có trong list không

        students.remove(0);
        students.remove("Long"); // Xóa phần tử theo chỉ số hoặc giá trị

        students.clear(); // Xóa toàn bộ phần tử
    }
}
