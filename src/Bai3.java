import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int length, width;

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều dài: ");
        length = sc.nextInt();

        System.out.println("Nhập chiều rộng: ");
        width = sc.nextInt();

        System.out.printf("Chu vi hình chữ nhật: %d\n", (length + width) * 2);
        System.out.printf("Diện tích hình chữ nhật: %d", length * width);
    }
}
