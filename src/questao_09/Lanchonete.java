package questao_09;

public class Lanchonete {
    public static double calcularTotal(int codigo, int quantidade) {
        double preco = switch (codigo) {
            case 1 -> 5.00;
            case 2 -> 3.50;
            case 3 -> 4.80;
            case 4 -> 8.90;
            case 5 -> 7.32;
            default -> 0.0;
        };
        return preco * quantidade;
    }
}
