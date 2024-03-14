package L_Lista;

public class Main {
    
    public static void main (String[] args) {
        System.out.println("Partiti!");
        
        Lista l = new Lista();
        System.out.println( l );

        for (int i=0; i<10; i++) {
            l.addTail( new Nodo( i, null ));
        }
        l.addHead(new Nodo(2024,null));

        



        System.out.println( l );
    } 

}