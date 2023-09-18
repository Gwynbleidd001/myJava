//Clase necesaria para la manipulación de nodos de una lista enlazada

public class Nodo{
    private T elem;
    private Node<T> next;

    //Constructor de la clase
    public Nodo(){
        elem = null;
        next = null;

    }

    //Setters
    public void setElem(T elem){
        this.elem = elem;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

    //Getters
    public T outElem(){
        return elem;
    }

    public T outNext(){
        return next;
    }
}