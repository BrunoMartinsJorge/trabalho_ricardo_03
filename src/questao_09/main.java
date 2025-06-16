package questao_09;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um codigo: ");
        int cod = entrada.nextInt();
        System.out.print("Digite a quantidade: ");
        int qtd = entrada.nextInt();
        System.out.println("Valor a pagar: R$ 15.00: " + Lanchonete.calcularTotal(cod, qtd));
        entrada.close();
    }
}
