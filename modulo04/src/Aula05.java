package src;

import java.util.Locale;
import java.util.Scanner;

public class Aula05 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exemplo 01
        //String x;
        //x = sc.next();
        //System.out.println("Você digitou: " + x);

        // Exemplo 02
        //int x;
        //x = sc.nextInt();
        //System.out.println("Você digitou: " + x);

        // Exemplo 03
        //double x;
        //x = sc.nextDouble();
        //System.out.println("Você digitou: " + x);
        //System.out.printf("Você digitou: %.2f%n", x);

        // Exemplo 04
        //char x;
        //x = sc.next().charAt(0);
        //System.out.println("Você digitou: " + x);

        // Exemplo 05
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();

    }

}
