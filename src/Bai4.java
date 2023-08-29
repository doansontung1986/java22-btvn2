import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        String date, month, year, dob;
        long age;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ngày sinh (định dạng hai chữ số): ");
        date = sc.next();

        System.out.print("Nhập tháng sinh (định dạng hai chữ số): ");
        month = sc.next();

        System.out.print("Nhập năm sinh (định dạng bốn chữ số): ");
        year = sc.next();

        dob = date + "/" + month + "/" + year;

        System.out.printf("Ngày tháng năm sinh của bạn là: %s\n", dob);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dobLocalDate = LocalDate.parse(dob, dateTimeFormatter);
        LocalDate now = LocalDate.now();

        age = ChronoUnit.YEARS.between(dobLocalDate, now);

        System.out.printf("Hiện tại bạn %d tuổi", age);
    }
}
