import java.util.Scanner;

public class Ex5a_nFactorialIterativ {
    //metoda iterativa pt n factorial
    public static long factorialI(int value) {
        long result = 1;
        for (int i = 2; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar n: ");
        int n = sc.nextInt();

        while( n >= 0) {
            System.out.println("factorialI(" + n + ") -> (" + factorialI(n) + ")");
            System.out.print("Introduceti un numar n: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}
