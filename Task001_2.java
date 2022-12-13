import java.util.Scanner;

public class Task001_2 {
    public static void main(String[] args) {
        System.out.print("¬ведите число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.print("–€д простых чисел: ");
        int count = 0;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count <= 2)
                System.out.printf("%s ", i);
            count = 0;
        }
    }
}
