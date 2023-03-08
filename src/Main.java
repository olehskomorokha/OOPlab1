import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int c = 9;
            double res = 0;

            System.out.print("Input a: ");
            double a = scanner.nextDouble();
            System.out.print("Input b: ");
            double b = scanner.nextDouble();
            System.out.print("Input n: ");
            int n = scanner.nextInt();
            System.out.print("Input m: ");
            int m = scanner.nextInt();
            System.out.println(a % b);

            if (a == c) {
                System.out.println("Ділення на ноль");
                return;
            }

            for (double i = a; i <= n; i++) {
                for (double j = b; j <= m; j++) {
                    res += (a % b)/(a - c);
                    System.out.println();
                }
            }
            System.out.println(res);

        }
        catch (java.util.InputMismatchException e){
            System.out.println("Введіть ціле число!");
        }
    }
}