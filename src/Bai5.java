import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        String str, s, s1, s2;
        char oneChar;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kỳ: ");
        str = sc.nextLine();
        System.out.println("Nhập 1 ký tự bất kỳ: ");
        oneChar = sc.nextLine().charAt(0);

        System.out.printf("Ký tự '%c' xuất hiện lần đầu tiên ở vị trí thứ %d trong chuỗi '%s'\n", oneChar, str.indexOf(oneChar), str);
        System.out.printf("Ký tự '%c' xuất hiện lần cuối cùng ở vị trí thứ %d trong chuỗi '%s'\n", oneChar, str.lastIndexOf(oneChar), str);

        System.out.println("-------------------");

        System.out.println("Press ENTER to continue...");
        sc.nextLine();

        System.out.println("Nhập chuỗi s: ");
        s = sc.nextLine();

        System.out.println("Nhập chuỗi s1: ");
        s1 = sc.nextLine();

        System.out.println("Nhập chuỗi s2: ");
        s2 = sc.nextLine();

        System.out.println(s.replace(s1, s2));
    }
}
