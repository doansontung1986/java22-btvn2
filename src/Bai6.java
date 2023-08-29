import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int canhDoi, canhKe;
        double canhHuyen, sin, cos;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập độ dài cạnh đối: ");
        canhDoi = sc.nextInt();

        System.out.print("Nhập độ dài cạnh kề: ");
        canhKe = sc.nextInt();


        canhHuyen = Math.sqrt(Math.pow(canhDoi, 2) + Math.pow(canhKe, 2));

        sin = canhDoi / canhHuyen;
        cos = canhKe / canhHuyen;

        System.out.printf("sin = %.2f\n", sin);
        System.out.printf("cos = %.2f\n", cos);
    }
}
