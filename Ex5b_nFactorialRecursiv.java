import java.util.Scanner;

public class Ex5b_nFactorialRecursiv {
    //metoda recursiva pt n factorial
    public static int factorialR(int value) {
        if (value == 0 || value == 1) {
            return 1;
        }
        return value * factorialR(value - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar n: ");
        int n = sc.nextInt();

        while (n >= 0) {
            System.out.println("factorialR(" + n + ") -> (" + factorialR(n) + ")");
            System.out.print("Introduceti un numar n: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}
