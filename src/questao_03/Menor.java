package questao_03;

public class Menor {

    private int valor1;
    private int valor2;
    private int valor3;

    public Menor(int valor1, int valor2, int valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    public Menor() {
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getValor3() {
        return valor3;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }

    public int buscarMenor(Menor valores){
        int menor = valores.getValor1();
        if (valores.getValor2() < menor) {
            menor = valores.getValor2();
        }
        if (valores.getValor3() < menor) {
            menor = valores.getValor3();
        }
        return menor;
    }
}
