import java.util.Scanner;

public class pizzaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira quantidade de chopps: ");
        int chopps = sc.nextInt();
        System.out.print("Insira a quantidade de pizzas: ");
        int quantiaPizzas = sc.nextInt();
        System.out.print("Insira a quantidade de coberturas: ");
        int coberturas = sc.nextInt();
        double pizza = quantiaPizzas * 63.00;
        double choppsconta = chopps * 8.80;
        double coberturasconta = coberturas * 5.50;
        double totalsem = coberturasconta + choppsconta + pizza;
        double totalgarcom = totalsem * 1.1;
        System.out.println("O valor total da conta ficou: R$" + totalgarcom);

    }
}