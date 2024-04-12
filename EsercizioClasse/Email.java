package EsercizioClasse;

import java.util.ArrayList;
import java.util.List;

public class Email {
    
    List<Mail> Email= new Arraylist<Mail>();
    List<Mail> ps;
    
    public Email(){
        ps=new ArrayList<Mail>();
        loadFromFile();


    }

    private void loadFromFile(){
        ps.add( new Mail("Andrea","Bancaria","Salve vorrei prelevare 50000000$",29,15));
        ps.add( new Mail("Riccardo","Lamentele","Vorrei lamentarmi",02,8));
        ps.add( new Mail("Federico","Spesa","Compra il miele",11,13));

    }   

    @Override
    public String toString(){
        return "Mail [ps=" +ps+ "]";
    }

    


}
