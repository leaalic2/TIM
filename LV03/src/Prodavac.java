public class Prodavac implements IZdravlje {
    private String ime;
    private String prezime;
    private int brojStanda;
    private String id;

    public Prodavac(String ime, String prezime, int brojStanda, String id) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojStanda = brojStanda;
        this.id = id;
    }

    public boolean Zdravlje() {
        return id.endsWith("01");
    }

    public String DajInformacije() {
        return "Prodavac: " + ime + " " + prezime + ", ID: " + id;
    }
}
