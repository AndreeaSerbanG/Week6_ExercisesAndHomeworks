import java.util.Scanner;

public class Ex7b_ProdusNumereRecursiv {
    /*metoda recursiva care realizeaza inmultirea a doua numere,pozitive sau negative,
      folosind doar operatorul de adunare
     */
    public static long multiplyWithSumR(int a, int b) {
        long sum = 0;
        if (a == 0) {
            return 0;
        }else if (a > 0){
            sum += b;
            return sum + multiplyWithSumR( a-1 , b);
        }else{
            sum -= b;
            return sum + multiplyWithSumR( a+1 , b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar a: ");
        int a = sc.nextInt();

        System.out.print("Introduceti un numar b: ");
        int b = sc.nextInt();

        while( a != 0 ) {
            System.out.println("multiplyWithSumR(" + a + ", " + b + ") -> (" + multiplyWithSumR(a, b) + ")");
            System.out.print("Introduceti un numar a: ");
            a = sc.nextInt();
            System.out.print("Introduceti un numar b: ");
            b = sc.nextInt();
        }
        sc.close();
    }
}
