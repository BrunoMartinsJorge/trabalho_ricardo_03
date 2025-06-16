package questao_11;

public class AumentoSalarial {

    public static void calcularReajuste(double salario) {
        double novoSalario;
        double aumento;
        int porcentagem;

        if (salario <= 1000.00) {
            porcentagem = 20;
        } else if (salario <= 3000.00) {
            porcentagem = 15;
        } else if (salario <= 8000.00) {
            porcentagem = 10;
        } else {
            porcentagem = 5;
        }

        aumento = salario * porcentagem / 100.0;
        novoSalario = salario + aumento;

        System.out.printf("Novo salario: R$ %.2f\n", novoSalario);
        System.out.printf("Aumento: R$ %.2f\n", aumento);
        System.out.printf("Porcentagem = %d%%\n", porcentagem);
    }
}