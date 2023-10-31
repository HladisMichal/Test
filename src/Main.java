import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Polozka> evidence = new ArrayList<>();
        String radek;
        BigDecimal cena = null;
        Integer pocet = null;
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader("data.txt")));
            while (scanner.hasNextLine()) {
                radek = scanner.nextLine();

                String[] pole = radek.split("#");
                String nazev = pole[0];
                pocet = Integer.valueOf(pole[1]);
                double hmotnost = Double.parseDouble(pole[2]);
                cena = BigDecimal.valueOf(Long.parseLong(pole[3]));
                String nabidka = pole[4];
                LocalDate datum = LocalDate.parse(pole[5]);

                Polozka polozka = new Polozka(nazev, pocet, hmotnost, cena, nabidka, datum);
                evidence.add(polozka);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(evidence);
        String celkovaCena;
        celkovaCena = pocet * cena;
        System.out.println(celkovaCena);
        for (pocet : Polozka) {
            if (pocet = 15) {
                System.out.println(pocet);
            }
        }
    }
}