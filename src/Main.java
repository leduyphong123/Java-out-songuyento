import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so luong nguyen to can xuat");
        number = input.nextInt();
        if (number > 20) {
            number = 20;
        }
        for (int i = 2; i < 1000; i++) {
            if (checkSNT(i)) {
                count += 1;
                System.out.print(i + " ");
                i += 1;
            }
            if (count >= number) {
                break;
            }
        }
    }

    public static boolean checkSNT(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}