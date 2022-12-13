import java.util.Scanner;

public class Task001_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("������� ������ �����: ");
        int a = in.nextInt();
        System.out.print("������� ������ �����: ");
        int b = in.nextInt();
        System.out.print("������� ��������� (+, -, *, /): ");
        String expression = in.next();
        switch (expression) {
            case "+":
                System.out.printf("�����: %s", Sum(a, b));
                break;
            case "-":
                System.out.printf("��������: %s", Sub(a, b));
                break;
            case "*":
                System.out.printf("������������: %s", Mult(a, b));
                break;
            case "/":
                System.out.printf("�������: %s", Div(a, b));
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
