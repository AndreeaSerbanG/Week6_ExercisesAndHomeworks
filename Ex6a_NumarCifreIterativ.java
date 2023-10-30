import java.util.Scanner;

public class Ex6a_NumarCifreIterativ {
    //metoda iterativa care primeste un numar n si returneaza numarul de cifre
    public static int numberLengthI(int value) {
        int digitNumber = 0;
        while (value != 0){
            digitNumber++;
            value /= 10;
        }
        return digitNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar n: ");
        int n = sc.nextInt();

        while( n != 0) {
            System.out.println("numberLengthI(" + n + ") -> (" + numberLengthI(n) + ")");
            System.out.print("Introduceti un numar n: ");
            n = sc.nextInt();
        }
        sc.close();
    }
}
