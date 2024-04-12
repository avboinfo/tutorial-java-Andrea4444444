import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class Lista() { //implementa una classe lista con dei nodi, contiene tutti i vari metodi, come aggiungi ecc..
    private Nodo head;

    public Lista() {
        head = null;
    }

    public void aggiungi(int codice) {
        Nodo nuovoNodo = new Nodo(codice);
        nuovoNodo.next = head;
        head = nuovoNodo;
    }

    public void eliminaUltimo() {
        if (head == null) {
            System.out.println("Lista vuota");
            return;
        }


        head = head.next;

    }



    public void elimina(int codice) {


        Nodo current = head;
        Nodo previous = null;


        if (current != null && current.codice == codice) {
        head = current.next;
            return;
        }

        while (current != null && current.codice != codice) {

        previous = current;
        current = current.next;
        }

        if (current == null) {
            System.out.println("Prodotto non trovato.");
        return;
        }

        previous.next = current.next;
    }

    public void stampa() {
        Nodo current = head;

        while (current != null) {
            System.out.println(current.codice);
            current = current.next;
        }
    }

    public void salvaSuFile() {
        try {
            FileWriter fileWriter = new FileWriter("prodotti.csv");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            Nodo current = head;

            while (current != null) {
                printWriter.println(current.codice);
                current = current.next;
            }

            printWriter.close();
        } catch (Exception e) {
            System.out.println("Errore durante il salvataggio su file");
        }
    }
}
