import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exemplo 01
        // String x;
        // int x;
        // double x;
        // char x;

        // x = sc.next();
        // x = sc.nextInt();
        // x = sc.nextDouble();
        // x = sc.next().charAt(0);


        // System.out.println("Você digitou: " + x);
        // System.out.printf("Você digitou: %.2f%n", x);

        // Exemplo 02
        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}