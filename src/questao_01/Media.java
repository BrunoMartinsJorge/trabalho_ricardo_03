package questao_01;

public class Media {

    private double nota1;
    private double nota2;

    public Media(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Media() {
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void calcularMedia(Media notas) {
        double media = (notas.getNota1() + notas.getNota2());
        media = Math.round(media * 10) / 10d;
        System.out.println("NOTA FINAL = " + media);
        if (media < 60)
            System.out.println("REPROVADO!");
    }
}
