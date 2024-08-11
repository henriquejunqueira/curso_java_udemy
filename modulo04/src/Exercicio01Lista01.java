import java.util.Scanner;

public class Exercicio01Lista01 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int valor01 = entrada.nextInt();
        int valor02 = entrada.nextInt();

        System.out.println("SOMA = " + (valor01 + valor02));

        entrada.close();
    }

}
