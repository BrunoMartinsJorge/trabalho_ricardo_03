package questao_05;

public class PlanoTelefonia {
    public static double calcularValor(int minutos) {
        double valorBase = 50.00;
        if (minutos > 100) {
            int excedente = minutos - 100;
            return valorBase + (excedente * 2.00);
        } else {
            return valorBase;
        }
    }
}
