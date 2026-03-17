import java.util.List;

public class Voce extends Namirnica {
    private double koeficijentZdravlja;

    public Voce(String naziv, String zemljaPorijekla, List<Double> nutritivneVrijednosti, double koeficijentZdravlja) {
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
        return DajBrojKalorija() < 50 && koeficijentZdravlja > 0.75;
    }

    // EJ OTKAD SAM SE ROODIOOOO SRECE NISAM IMAOOOO
}
