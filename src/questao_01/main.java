package questao_01;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Media media = new Media();
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        media.setNota1(nota1);
        media.setNota2(nota2);
        media.calcularMedia(media);
        entrada.close();
    }
}
