package questao_13;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Valor de X: ");
        double x = sc.nextDouble();
        System.out.print("Valor de Y: ");
        double y = sc.nextDouble();
        System.out.println(Coordenadas.verificarQuadrante(x, y));
        sc.close();
    }
}
