//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Obrigatóriamente uma variável em java precisa ter um valor antes de ser usada
        double price = 400.00;
//        double x = 20.0;
//        double price = x;

//        if(price < 200.00){
//            double discount = price * 0.1;
//        }

//        System.out.println(price);
//        System.out.println(discount); // variável sendo chamada fora de escopo

//        double discount = 0;
//        if(price < 200.00){
//            discount = price * 0.1;
//        }
//
//        System.out.println(discount);

        double discount;
        if(price < 200.00){
            discount = price * 0.1;
        }else{
            discount = 0;
        }

        System.out.println(discount);
    }
}