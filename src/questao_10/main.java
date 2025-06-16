package questao_10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valorA = entrada.nextInt();
        System.out.print("Digite um valor: ");
        int valorB = entrada.nextInt();
        System.out.println(Multiplos.saoMultiplos(valorA, valorB) ? "São multiplos!" : "Não são multiplos!");
        entrada.close();
    }
}
