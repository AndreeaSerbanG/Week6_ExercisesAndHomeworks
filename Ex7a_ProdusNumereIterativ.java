import java.util.Scanner;

public class Ex7a_ProdusNumereIterativ {
    /*metoda iterativa care realizeaza inmultirea a doua numere,pozitive sau negative,
      folosind doar operatorul de adunare
     */
    public static long multiplyWithSumI(int a, int b) {
        long sum = 0;
        while(a != 0 ){
            if( a > 0) {
                sum += b;
                a--;
            }else{
                sum -= b;
                a++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar a: ");
        int a = sc.nextInt();

        System.out.print("Introduceti un numar b: ");
        int b = sc.nextInt();

        while( a != 0) {
            System.out.println("multiplyWithSumI(" + a + ", " + b + ") -> (" + multiplyWithSumI(a, b) + ")");
            System.out.print("Introduceti un numar a: ");
            a = sc.nextInt();
            System.out.print("Introduceti un numar b: ");
            b = sc.nextInt();
        }
        sc.close();
    }
}
