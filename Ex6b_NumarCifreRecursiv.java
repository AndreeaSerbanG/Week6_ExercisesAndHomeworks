import java.util.Scanner;

public class Ex6b_NumarCifreRecursiv {
    //metoda recursiva care primeste un numar n si returneaza numarul de cifre
    public static int numberLengthR(int value) {
        if( value < 10){
            return 1;
        }
        return 1 + numberLengthR(value/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar n: ");
        int n = sc.nextInt();

        while( n != 0) {
            System.out.println("numberLengthR(" + n + ") -> (" + numberLengthR(n) + ")");
            System.out.print("Introduceti un numar n: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}
