import java.util.Scanner;

public class Ex4_AfisarePalindroame {
    /*
       the program displays all palindrome numbers up to a value n read from the keyboard. Write the modularized code,
        using at least one method that determines whether a number is palindrome and another method that displays all
        palindrome numbers up to n. Test the code in main(…), for various values of (n).
        */
    public static boolean isPalindrome(int number){


        int _number = number;
        int palindrome = 0;

        while (_number != 0) {
            int lastDigit = _number % 10;
            palindrome = palindrome * 10 + lastDigit;
            _number /= 10;
        }
        if (number == palindrome) {
            return true;
        }
        return false;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti un numar n:");
        int number = sc.nextInt();

        for( int i = 0; i <= number; i++){
            if(isPalindrome(i)){
                System.out.print(i + " ");
            }
        }
    }
}
