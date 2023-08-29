import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        double a, b, c, delta;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập hệ số a: ");
        a = sc.nextDouble();

        System.out.print("Nhập hệ số b: ");
        b = sc.nextDouble();

        System.out.print("Nhập hệ số c: ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        String result = (delta > 0) ? ("Phương trình có 2 nghiệm x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)) + " và x2 = " + ((-b - Math.sqrt(delta)) / (2 * a))) : ((delta == 0) ? "Phương trình có nghiệm kép x1 = x2 = " + (-b / (2 * a)) : "Phương trình vô nghiệm");

        System.out.println(result);
    }
}
