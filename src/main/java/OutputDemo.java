public class OutputDemo {
    public static void main(String[] args) {
        // Escape characters
        // \" --> "
        // \' --> '
        // \\ --> \
        // \n --> Xuống dòng
        // \t --> Tab

        // System.out.println
        System.out.println("\"Java\" Core");
        System.out.println("'Java' Core");
        System.out.println("\\Java\\ Core");

        // System.out.print
        System.out.print("\tJava Core\n");
        System.out.print("Java Core\n");
        System.out.print("Java Core\n");

        // System.out.printf
        // %s: Đại diện cho String
        // %d: Đại diện cho số nguyên
        // %f: Đại diện cho số thực
        // %c: Đại dện cho kí tự
        // %n: Xuống dòng
        System.out.printf("Họ tên: %s, tuổi: %d.%n", "Khoa", 20);

        // Căn lề
        System.out.println("+----+--------------------+");
        System.out.println("| ID |      FULL NAME     |");
        System.out.println("+----+--------------------+");
        System.out.printf("| %-2d | %-18s |%n", 1, "Khoa");
        System.out.printf("| %-2d | %-18s |%n", 2, "Khoa");
        System.out.printf("| %-2d | %-18s |%n", 3, "Khoa");
        System.out.printf("| %-2d | %18s |%n", 4, "Khoa");

        // Gom nhóm, làm tròn
        double money = 12345654321.789;
        System.out.printf("money = %.2f%n", money); // Làm tròn
        System.out.printf("money = %,f%n", money); // Gom nhóm 3 chữ số
        System.out.printf("money = %,.2f", money);
    }
}
