import java.util.Scanner;

public class Ex2_AfisareNumarDeCifre {
    //Implementează o metodă care primește ca parametru un număr întreg și returnează numărul de cifre al acelui număr

    public static int digitNumber( int number){
        int digits = 0;
        while(number!= 0){
            digits ++;
            number /= 10;
        }
        return digits;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar: ");
        int number = sc.nextInt();

        while(number!= -1){
            System.out.println("Numarul " + number + " are " + digitNumber(number)+ " litere.");
            System.out.print("Introduceti un numar: ");
            number = sc.nextInt();
        }

    }
}
