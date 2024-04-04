package E_quadrimestre;

public class Veicolo {
    
    String targa;
    String marca;
    String modello;
    String cilindrata;
    int anno;
    int numeriPosti;

    public Veicolo(String targa, String marca, String modello, String cilindrata, int anno, int numeriPosti){
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.anno = anno;
        this.numeriPosti = numeriPosti;
    }
    
    public String toString(){
        return "la targa è: " + targa + ", la marca è: " + marca + ", il modello è: " + modello + ", la cilindrata è: " + cilindrata +
        ", dell'anno " + anno + " e ha " + numeriPosti + " posti";
    }
}
