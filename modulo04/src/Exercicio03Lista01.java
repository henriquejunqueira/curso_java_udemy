import java.util.Scanner;

public class Exercicio03Lista01 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int C = entrada.nextInt();
        int D = entrada.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + diferenca);

        entrada.close();
    }

}
