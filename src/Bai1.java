import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        double a, b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        a = sc.nextDouble();

        System.out.print("Nhập hệ số b: ");
        b = sc.nextDouble();

        String result = a != 0 ? "Nghiệm của phương trình là x = " + -b / a : (b != 0) ? "Phương trình vô nghiệm" : "Phương trình có vô số nghiệm";

        System.out.println(result);

    }
}
