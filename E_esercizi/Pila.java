import java.util.ArrayList;

public class Pila {
    ArrayList<T>lista;
    
    public Pila(){
        lista= new ArrayList<T>();
    }

    public void push(T newElement){

        list.add(newElement);

    }

    public T pop(){
        int size= list.size();
        if(size==0)return null; 
        T x= list.get(size-1);
        list.remove(size-1);
        return x;   
    }
     public string toString(){
        String s= "";
            for(int i=0; i<list.size;i++){
                s + = list.get(i);
            }
        return s;
     }




}
