import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class skladovaPolozka {

    private String nazev;
    private Integer pocet;
    private double hmotnost;
    private BigDecimal cena;
    private String nabidka;
    private LocalDate datum;

    public skladovaPolozka(String nazev, Integer pocet, double hmotnost, BigDecimal cena, String nabidka, LocalDate datum) throws NeniNaSkladeExpection {
        this.nazev = nazev;
        this.pocet = pocet;
        this.hmotnost = hmotnost;
        this.cena = cena;
        this.nabidka = nabidka;
        this.datum = datum;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public Integer getPocet() {
        return pocet;
    }

    public void setPocet(Integer pocet) {
        this.pocet = pocet;
    }

    public double getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(double hmotnost) {
        this.hmotnost = hmotnost;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public String isNabidka() {
        return nabidka;
    }

    public void setNabidka(String nabidka) {
        if (nabidka.contains("ne")) {
            try {
                throw new NeniNaSkladeExpection("Položka není na skladě");
            } catch (NeniNaSkladeExpection e) {
                throw new RuntimeException(e);
            }
        }

        this.nabidka = nabidka;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }
}
