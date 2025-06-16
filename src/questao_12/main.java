package questao_12;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o inicio");
        int inicio = entrada.nextInt();
        System.out.print("Digite o fim");
        int fim = entrada.nextInt();
        System.out.println("Duração: " + DuracaoJogo.calcularDuracao(inicio, fim));
        entrada.close();
    }
}
