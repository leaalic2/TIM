import java.util.List;

public class Povrce extends Namirnica {
    private double koeficijentZdravlja;

    public Povrce(String naziv, String zemljaPorijekla, List<Double> nutritivneVrijednosti, double koeficijentZdravlja) {
        super(naziv, zemljaPorijekla, nutritivneVrijednosti);
        this.koeficijentZdravlja = koeficijentZdravlja;
    }

    public double DajBrojKalorija() {
        double suma = 0;
        for(double v : nutritivneVrijednosti)
            suma += v;
        return suma;
    }

    public boolean Zdravlje() {
        return DajBrojKalorija() < 100 && koeficijentZdravlja >= 0.5 && koeficijentZdravlja <= 0.7;
    }

    // TIM 4 GRUPA  JE NAJJACIIIII
}

