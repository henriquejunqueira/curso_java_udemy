import java.util.Locale;
import java.util.Scanner;

public class Exercicio05Lista01 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int codigoPeca01 = entrada.nextInt();
        int numeroPecas01 = entrada.nextInt();
        double valorPorPeca01 = entrada.nextDouble();

        int codigoPeca02 = entrada.nextInt();
        int numeroPecas02 = entrada.nextInt();
        double valorPorPeca02 = entrada.nextDouble();

        double totalPagar = (numeroPecas01 * valorPorPeca01) + (numeroPecas02 * valorPorPeca02);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagar);

        entrada.close();
    }

}
