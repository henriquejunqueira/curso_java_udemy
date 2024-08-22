package src;

import java.util.Scanner;

public class Aula06 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Exemplo 01
        //String s1, s2, s3;
        //s1 = sc.nextLine();
        //s2 = sc.nextLine();
        //s3 = sc.nextLine();

        //System.out.println("DADOS DIGITADOS:");
        //System.out.println(s1);
        //System.out.println(s2);
        //System.out.println(s3);

        // Exemplo 02
        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); // sem esse nextLine, ocorrerá o erro descrito abaixo (limpa o buffer de leitura)
        s1 = sc.nextLine(); // esse nextLine vai armazenar uma quebra de linha e passar par o próximo comando
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
