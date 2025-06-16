package questao_02;

public class Bhaskara {

    private double valorA;
    private double valorB;
    private double valorC;

    public Bhaskara(double valorA, double valorB, double valorC) {
        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;
    }

    public Bhaskara() {
    }

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    public double getValorC() {
        return valorC;
    }

    public void setValorC(double valorC) {
        this.valorC = valorC;
    }

    private double calcularDelta(Bhaskara valores) {
        return Math.pow(valores.getValorB(), 2) - (4 * valores.getValorA() * valores.getValorC());
    }

    public void calcularBhaskara(Bhaskara valores) {
        double delta = calcularDelta(valores);

        if (delta > 0) {
            double x = ((-valores.getValorB()) + Math.sqrt(delta)) / (2 * valores.getValorA());
            double y = ((-valores.getValorB()) - Math.sqrt(delta)) / (2 * valores.getValorA());
            x = Math.round(x * 10000) / 10000d;
            y = Math.round(y * 10000) / 10000d;
            System.out.println("Valor X = " + x);
            System.out.println("Valor Y = " + y);
        } else if (delta == 0) {
            double x = (-valores.getValorB()) / (2 * valores.getValorA());
            x = Math.round(x * 10000) / 10000d;
            System.out.println("Valor X = " + x);
        } else {
            System.out.println("Esta equação não possui raízes reais!");
        }
    }
}
