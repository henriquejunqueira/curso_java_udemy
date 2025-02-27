import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exercicio 01
        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.

        // int x, y, soma;

        // x = sc.nextInt();
        // y = sc.nextInt();

        // soma = x + y;

        // System.out.println("SOMA = " + soma);

        // Exercicio 02
        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        // casas decimais conforme exemplos.
        // Fórmula da área: area = π . raio2
        // Considere o valor de π = 3.14159

        // double raio;
        // double area;
        // double pi = 3.14159;
        
        // raio = sc.nextDouble();

        // area = pi * Math.pow(raio, 2);

        // System.out.printf("A=%.4f", area);

        // Exercicio 03
        // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        // de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int C = sc.nextInt();
        // int D = sc.nextInt();

        // int diferenca = (A * B - C * D);

        // System.out.println("DIFERENCA = " + diferenca);

        // Exercicio 04
        // Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        // hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        // decimais.

        // int numeroFuncionario = sc.nextInt();
        // int horasTrabalhadas = sc.nextInt();
        // double valorPorHora = sc.nextDouble();

        // double salario = horasTrabalhadas * valorPorHora;

        // System.out.println("NUMBER = " + numeroFuncionario);
        // System.out.printf("SALARY = U$ %.2f", salario);

        // Exemplo 05
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        // código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        // int codigoPeca1 = sc.nextInt();
        // int numeroPeca1 = sc.nextInt();
        // double valorPeca1 = sc.nextDouble();

        // int codigoPeca2 = sc.nextInt();
        // int numeroPeca2 = sc.nextInt();
        // double valorPeca2 = sc.nextDouble();

        // double total = (numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2);

        // System.out.printf("VALOR A PAGAR: R$ %.2f", total);

        // Exercicio 06
        // Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        // mostre:
        // a) a área do triângulo retângulo que tem A por base e C por altura.
        // b) a área do círculo de raio C. (pi = 3.14159)
        // c) a área do trapézio que tem A e B por bases e C por altura.
        // d) a área do quadrado que tem lado B.
        // e) a área do retângulo que tem lados A e B.

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;

        double areaTrianguloRetangulo = A * C / 2.0;
        double areaRaioCirculo = pi * Math.pow(C, 2);
        double areaTrapezio = (A + B) / 2.0 * C;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", areaRaioCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        sc.close();
    }
}