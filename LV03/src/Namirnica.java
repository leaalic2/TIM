import java.util.List;

public abstract class Namirnica implements IZdravlje {
    protected String naziv;        // za voće i povrće: latinski naziv; za meso: vrsta
    protected String zemljaPorijekla;
    protected List<Double> nutritivneVrijednosti; // kalorije pojedinačnih komponenti

    //ne znam sta da izmjenim

    public Namirnica(String naziv, String zemljaPorijekla, List<Double> nutritivneVrijednosti) {
        this.naziv = naziv;
        this.zemljaPorijekla = zemljaPorijekla;
        this.nutritivneVrijednosti = nutritivneVrijednosti;
    }

    // Apstraktna metoda za broj kalorija
    public abstract double DajBrojKalorija();
}
