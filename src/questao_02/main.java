package questao_02;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Bhaskara bhaskara = new Bhaskara();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Coeficiente A: ");
        bhaskara.setValorA(entrada.nextDouble());
        System.out.print("Coeficiente B: ");
        bhaskara.setValorB(entrada.nextDouble());
        System.out.print("Coeficiente C: ");
        bhaskara.setValorC(entrada.nextDouble());
        bhaskara.calcularBhaskara(bhaskara);
        entrada.close();
    }
}
