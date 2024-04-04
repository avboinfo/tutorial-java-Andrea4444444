package L_Lista; 

public class ListaGen<T> {
    
    NodoGen<T> root;

    public ListaGen(){
        this.root=null;
        
    }

    public void addTail(T v){
        addTail(new NodoGen<T>(v));
    }



    public void addTail(Nodo<T> n){
        if (root==null){
            root =n;
        }else{
            NodoGen<T> tmp=root;
            while(tmp.getSuccessivo()!null)tmp=getSuccessivo();
            tmp.setSuccessivo(n);
        }
    }


    public String toString(){
        
    }
}
