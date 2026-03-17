import java.util.List;
public String getNaziv() {
    return naziv;
}

public String getZemljaPorijekla() {
    return zemljaPorijekla;
}

public List<Double> getNutritivneVrijednosti() {
    return nutritivneVrijednosti;
}
public abstract class Namirnica implements IZdravlje {
    protected String naziv;        // za voće i povrće: latinski naziv; za meso: vrsta
    protected String zemljaPorijekla;
    protected List<Double> nutritivneVrijednosti; // kalorije pojedinačnih komponenti

    public Namirnica(String naziv, String zemljaPorijekla, List<Double> nutritivneVrijednosti) {
        this.naziv = naziv;
        this.zemljaPorijekla = zemljaPorijekla;
        this.nutritivneVrijednosti = nutritivneVrijednosti;
    }

    // Apstraktna metoda za broj kalorija
    public abstract double DajBrojKalorija();
}
