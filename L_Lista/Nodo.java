package L_Lista;

public class Nodo {

    private int tvalore;
    private Nodo successivo;

    public Nodo( int valore, Nodo successivo ) {
        this.tvalore = valore;
        this.successivo = successivo;
    }

    public void setValore( int nuovoValore ) {
        tvalore = nuovoValore;
    }

    public void setSuccessivo( Nodo nuovoSuccessivo ) {
        successivo = nuovoSuccessivo;
    } 

    public int getValore() {
        return tvalore;
    }

    public Nodo getSuccessivo() {
        return successivo;
    }

    public String toString() {
        return "[" + tvalore + "]";
    }
}
