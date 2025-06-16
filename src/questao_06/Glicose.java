package questao_06;

public class Glicose {
    public static String classificar(double glicose) {
        if (glicose <= 100.0) {
            return "normal";
        } else if (glicose <= 140.0) {
            return "elevado";
        } else {
            return "diabetes";
        }
    }
}
