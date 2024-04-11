package EsercizioClasse;

public class Mail {

    String mittente, oggetto, testo;
    int data, ora;

    public Mail(String mittente,String oggetto,String testo, int data, int ora){
        
        this.mittente=mittente;
        this.oggetto=oggetto;
        this.testo=testo;
        this.data=data;
        this.ora=ora;

    }
}
