import java.util.Scanner;

public class Ex1_AfisareNumerePrime {
    /*   algoritm care citește de la tastatură un număr n și afișează toate numerele prime până la n (inclusiv),
         începând cu 2. Modularizează implementarea algoritmului folosind două metode:
     */

    //    una care indică dacă un număr este prim sau nu
    public static boolean isPrime( int number){
        if(number < 2) {
            return false;
        }
        for( int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    //    alta care afișează toate numerele prime până la n (primit ca argument la apel)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar n: ");
        int n = sc.nextInt();

        for( int i = 0; i <= n; i++ ){
            if(isPrime(i)){
                System.out.print( i + " ");
            }
        }
    }
}
