import java.util.List;

public class Meso extends Namirnica {
    private double koeficijentZdravlja;

    public Meso(String vrsta, String zemljaPorijekla, List<Double> nutritivneVrijednosti, double koeficijentZdravlja) {
        super(vrsta, zemljaPorijekla, nutritivneVrijednosti);
        this.koeficijentZdravlja = koeficijentZdravlja;
    }

    public double DajBrojKalorija() {
        double suma = 0;
        for(double v : nutritivneVrijednosti)
            suma += v;
        return suma * 1.2; // povećano 20%
    }

    public boolean Zdravlje() {
        return koeficijentZdravlja > 0.95;
    }
}
