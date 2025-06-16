package questao_11;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario da pessoa: ");
        double salario = sc.nextDouble();

        AumentoSalarial.calcularReajuste(salario);

        sc.close();
    }
}
