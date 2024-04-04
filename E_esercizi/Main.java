import java.io.File;
import java.util.*;

public class Main{
    public static void main(String[] args){
        File f= new File("E_esercizi/DatiIn.txt");
        try{
         Scanner scanner= new Scanner(f);

         while (scanner.hasNextLine());{
            String line=scanner nextLine();
            p.push(line);
         }
         scanner.close();

        }catch(Exeption e){
            System.out.println.("error: " + e.toString());
        }

        System.out.println (p); 





    }

 