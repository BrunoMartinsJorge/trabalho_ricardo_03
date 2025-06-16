package questao_03;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Menor menor = new Menor();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor 1: ");
        menor.setValor1(entrada.nextInt());
        System.out.print("Valor 2: ");
        menor.setValor2(entrada.nextInt());
        System.out.print("Valor 3: ");
        menor.setValor3(entrada.nextInt());
        System.out.println("MENOR = " + menor.buscarMenor(menor));
        entrada.close();
    }
}
