package questao_12;

public class DuracaoJogo {
    public static int calcularDuracao(int inicio, int fim) {
        if (inicio < fim) {
            return fim - inicio;
        } else if (inicio > fim) {
            return 24 - inicio + fim;
        } else {
            return 24;
        }
    }
}
