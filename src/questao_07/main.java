package questao_07;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Distancia 1: ");
        double d1 = entrada.nextDouble();
        System.out.print("Distancia 2: ");
        double d2 = entrada.nextDouble();
        System.out.print("Distancia 3: ");
        double d3 = entrada.nextDouble();
        Dardo.maiorDistancia(d1, d2, d3);
        entrada.close();
    }
}
