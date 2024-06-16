import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTypeDemo {
    public static void main(String[] args) {
        // Kiểu số nguyên
        // byte (1), short (2), int (4), long (8)
        int age = 18;
        System.out.println("age = " + age);

        // Kiểu số thực
        // float (4), double (8)
        double piDouble = 3.14159;
        float piFloat = 3.14159653f;
        System.out.println("piDouble = " + piDouble);
        System.out.println("piFloat = " + piFloat);

        // Kiểu logic
        // boolean (1)
        boolean isLoading = true;
        System.out.println("isLoading = " + isLoading);

        // Kiểu kí tự
        // char (2)
        char c = 'C';
        System.out.println("c = " + c);

        // Kiểu xâu kí tự
        // String
        String s = "Java Core";
        System.out.println("s = " + s);

        // Kiểu thời gian
        // LocalDate, LocalTime, LocalDateTime
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        LocalDate date = LocalDate.of(2019, 3, 19);
        System.out.println("date = " + date);
        LocalDateTime localDateTime = LocalDateTime.parse("2024-06-07 09:00:01", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("localDateTime = " + localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        // Kiểu enum
        UIState state = UIState.LOADING;
        System.out.println("state = " + state);

        // Kiểu array (mảng)
        int[] numbers = {2, 5, 9, 4, 1};
        System.out.println("numbers.length = " + numbers.length);
        // Chỉ số: bắt đầu từ 0
        System.out.println("numbers[0] = " + numbers[0]);
        // Cách khởi tạo khác
        String[] fruits;
        // ...
        fruits = new String[]{"Cam", "Mận", "Táo"};
        char[] characters = new char[10];
        System.out.println("characters.length = " + characters.length);
        // Cập nhật giá trị theo chỉ số
        System.out.println("characters[0] = " + characters[0]);
        characters[0] = 'K';
        System.out.println("characters[0] = " + characters[0]);
    }
}
