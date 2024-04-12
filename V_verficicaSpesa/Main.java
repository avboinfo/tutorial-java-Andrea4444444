import java.util.Scanner;

public class Main { //contiene il menù in cui l'utente può selezionare l'opzione che vuole
    public static void main(String[] args) {
        Spesa spesa = new Spesa();
        try (Scanner scanner = new Scanner(System.in)) {
            int scelta;

            do { //menu
                System.out.println("\nMenu:");
                System.out.println("1. Aggiungi prodotto");
                System.out.println("2. Elimina ultimo prodotto inserito");
                System.out.println("3. Elimina prodotto");
                System.out.println("4. Calcola costo totale");
                System.out.println("5. Stampare lista");
                System.out.println("6. Stampare lista e salvare su file");
                System.out.println("0. Esci");

                System.out.print("Scelta: ");
                scelta = scanner.nextInt();

                switch (scelta) { //serve per collegare la funzione alla scelta dell'utente
                    case 1:
                        System.out.print("Inserire codice prodotto da aggiungere: ");
                        int codice = scanner.nextInt();
                        spesa.aggiungiProdotto(codice);
                        break;

                    case 2:
                        spesa.eliminaUltimoProdotto();
                        break;

                    case 3:
                        System.out.print("Inserire codice prodotto da eliminare: ");
                        codice = scanner.nextInt();
                        spesa.eliminaProdotto(codice);
                        break;

                    case 4:
                        System.out.println("Costo totale: " + spesa.calcolaCosto());
                        break;

                    case 5:
                        System.out.println("Lista:");
                        spesa.stampaLista();
                        break;

                    case 6:
                        System.out.println("Lista:");
                        spesa.stampaEsalvaSuFile();
                        break;
                }

            } while (scelta != 0);
        }catch(Exception e){
            System.out.println("errore");
        }
    }
}