import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spesa { //  gestisce una lista di prodotti e fornisce metodi per aggiungere eliminare prodotti ecc...
    Lista listaProdotti;
    Prodotto[] prodotti;

    public Spesa() {
        listaProdotti = new Lista();
        caricaProdottiDaFile();
    }

    public void caricaProdottiDaFile() {
        try {

            Scanner scanner = new Scanner(new File("prodotti.csv"));

            int numProdotti = 0;
            while (scanner.hasNext()) {
                scanner.nextLine();
                numProdotti++;
            }

            prodotti = new Prodotto[numProdotti];
            scanner = new Scanner(new File("prodotti.csv"));

            for (int i = 0; i < numProdotti; i++) {
                String[] line = scanner.nextLine().split(",");
                prodotti[i] = new Prodotto(Integer.parseInt(line[0]), line[1], Double.parseDouble(line[2]));
            }

        } catch (Exception e) {
            System.out.println("File prodotti.csv non trovato.");
        }
    }

    public void aggiungiProdotto(int codice) {
    listaProdotti.aggiungi(codice);
    }

    public void eliminaUltimoProdotto() {
    listaProdotti.eliminaUltimo();
    }

    public void eliminaProdotto(int codice) {
    listaProdotti.elimina(codice);
    }

    public double calcolaCosto() {
        double costoTotale = 0;

        Nodo current = listaProdotti.head;
        while (current != null) {
            for (Prodotto prodotto : prodotti) {
                if (prodotto.codice == current.codice) {
                costoTotale += prodotto.costo;
                    break;
                }
            }
            current = current.next;
        }

        return costoTotale;
    }

    public void stampaLista() {
    listaProdotti.stampa();
    }

    public void stampaEsalvaSuFile() {
    listaProdotti.stampa();
        listaProdotti.salvaSuFile();
    }
}