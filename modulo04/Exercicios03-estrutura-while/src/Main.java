import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Exercício 01
        /*
        * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        * incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
        */

//        int senha = 2002;
//
//        int senha_digitada = sc.nextInt();
//
//        while (senha_digitada != senha){
//            System.out.println("Senha Invalida");
//            senha_digitada = sc.nextInt();
//        }
//
//        System.out.println("Acesso Permitido");

        // Exercício 02
        /*
        * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        * menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
        */

        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != 0 && y != 0){

            if(x > 0 && y > 0){
                System.out.println("primeiro");
            }else if(x < 0 && y > 0){
                System.out.println("segundo");
            }else if(x < 0 && y < 0){
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }

            x = sc.nextInt();
            y = sc.nextInt();
        }

    }
}