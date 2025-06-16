package questao_08;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)?");
        String op = entrada.nextLine();
        if (op.equalsIgnoreCase("C")) {
            System.out.print("Digite uma temperatura: ");
            double temperatura = entrada.nextDouble();
            System.out.println("Temperatura: " + ConversorTemperatura.celsiusParaFahrenheit(temperatura));
        } else {
            System.out.print("Digite uma temperatura: ");
            double temperatura = entrada.nextDouble();
            System.out.println("Temperatura: " + ConversorTemperatura.fahrenheitParaCelsius(temperatura));
        }
        entrada.close();
    }
}
