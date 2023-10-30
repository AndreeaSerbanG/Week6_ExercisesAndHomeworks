import java.util.Scanner;

public class Ex3_ProdusulNumerelor {
    //The program performs the product of two, three, and four numbers
    public static double multiply2(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double multiply3(double operand1, double operand2, double operand3) {
        return multiply2(multiply2(operand1,operand2), operand3);
    }

    public static double multiply4(double operand1, double operand2, double operand3, double operand4) {
        return multiply2(multiply3(operand1, operand2, operand3), operand4);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceti primul operand: ");
        double operand1 = sc.nextDouble();

        System.out.print("Introduceti al doilea operand: ");
        double operand2 = sc.nextDouble();

        System.out.print("Introduceti al treilea operand: ");
        double operand3 = sc.nextDouble();

        System.out.print("Introduceti al patrulea operand: ");
        double operand4 = sc.nextDouble();

        System.out.println("\noperand1 * operand2 =  "
                + multiply2(operand1,operand2));
        System.out.println("operand1 * operand2 * operand3 =  "
                + multiply3(operand1,operand2, operand3));
        System.out.println("operand1 * operand2 * operand3 * operand 4 =  "
                + multiply4(operand1,operand2, operand3, operand4));
    }
}
