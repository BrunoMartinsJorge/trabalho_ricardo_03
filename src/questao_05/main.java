package questao_05;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();
        double valor = PlanoTelefonia.calcularValor(minutos);
        System.out.printf("Valor a pagar: R$ %.2f\n", valor);

        sc.close();
    }
}
