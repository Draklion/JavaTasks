
import java.util.Scanner;

public class Task001_1 {
    public static void main(String[] args) {
        System.out.print("������� �����: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0, fact = 1;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
            fact = fact * i;
        }
        System.out.printf("����������� �����: %s\n��������� �����: %s", sum, fact);
    }
}
