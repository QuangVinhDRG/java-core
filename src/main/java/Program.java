import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        String thoiGianPH = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("localDateTime = " + thoiGianPH);
    }
}
