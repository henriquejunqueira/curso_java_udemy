import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        double y = 25.0;
//        double x = Math.sqrt(y);
//        double x = Math.sqrt(25.0);
//
//        System.out.println(x);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResult(higher);
        
//        if(a > b && a > c){
//            System.out.println("Higher = " + a);
//        } else if (b > c) {
//            System.out.println("Higher = " + b);
//        }else {
//            System.out.println("Higher = " + c);
//        }

        sc.close();

    }

    public static int max(int x, int y, int z){
        int aux;
        
        if(x > y && x > z){
            aux = x;
        } else if (y > z) {
            aux = y;
        }else {
            aux = z;
        }

        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}