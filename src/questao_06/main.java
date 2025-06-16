package questao_06;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a glicose: ");
        double x = sc.nextDouble();
        System.out.println("Nivel de glicose: " + Glicose.classificar(x));
        sc.close();
    }
}
