import java.util.Scanner;

public class Task001_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
        System.out.print("Введите выражение (+, -, *, /): ");
        String expression = in.next();
        switch (expression) {
            case "+":
                System.out.printf("Сумма: %s", Sum(a, b));
                break;
            case "-":
                System.out.printf("Разность: %s", Sub(a, b));
                break;
            case "*":
                System.out.printf("Произведение: %s", Mult(a, b));
                break;
            case "/":
                System.out.printf("Частное: %s", Div(a, b));
                break;
        }
    }

    public static int Sum(int a, int b) {
        return a + b;
    }

    public static int Sub(int a, int b) {
        return a - b;
    }

    public static int Mult(int a, int b) {
        return a * b;
    }

    public static int Div(int a, int b) {
        return a / b;
    }
}
