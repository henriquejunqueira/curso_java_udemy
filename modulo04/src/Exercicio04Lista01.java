import java.util.Locale;
import java.util.Scanner;

public class Exercicio04Lista01 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int numeroFuncionario = entrada.nextInt();
        int horasTrabalhadas = entrada.nextInt();
        double valorHora = entrada.nextDouble();

        double salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        entrada.close();
    }

}
