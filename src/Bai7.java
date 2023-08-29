import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        int r = sc.nextInt();

        System.out.printf("Chu vi hình tròn là: %.3f\n", (r * 2 * Math.PI));
        System.out.printf("Diện tích hình tròn là: %.3f\n", (Math.pow(r, 2) * Math.PI));

    }
}
