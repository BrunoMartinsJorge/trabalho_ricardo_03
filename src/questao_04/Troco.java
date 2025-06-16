package questao_04;

import java.util.Scanner;

public class Troco {

    public void calcularTroco() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço unitário do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade comprada: ");
        int quantidade = sc.nextInt();

        System.out.print("Dinheiro recebido: ");
        double dinheiro = sc.nextDouble();

        double total = preco * quantidade;

        if (dinheiro >= total) {
            double troco = dinheiro - total;
            System.out.printf("TROCO = %.2f%n", troco);
        } else {
            double falta = total - dinheiro;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", falta);
        }

        sc.close();
    }
}