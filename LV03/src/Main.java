import java.time.LocalDate;

public abstract class Osoba implements IInformacije
{
    public int godinaStudija;
    protected String ime, prezime, adresa;
    protected LocalDate datumRodjenja;

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }


    public Osoba (String ime, String prezime, String adresa, LocalDate datumRodjenja)
    {
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.datumRodjenja = datumRodjenja;
    }

    public boolean ProvjeriMaticniBroj(String maticniBroj)
    {
        if (maticniBroj == null || maticniBroj.length() != 13) return false;
        try {
            int dan = Integer.parseInt(maticniBroj.substring(0, 2));
            int mjesec = Integer.parseInt(maticniBroj.substring(2, 4));
            return (dan >= 1 && dan <= 31 && mjesec >= 1 && mjesec <= 12);
        } catch (NumberFormatException e) {
            return false;
        }
    }


    public String DajInformacije()
    {
        return "Ime i prezime: " + ime + " " + prezime;
    }
}