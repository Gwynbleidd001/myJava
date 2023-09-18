package datos;

public class ListaEnl<T> implements Lista<T>{
    private Nodo<T> cabeza;
    private int cantElemts;

    // Constructor de la clase
    public ListaEnl(){
        cabeza = null;
        cantElemts = 0;
    }

    // Operaciones ofrecidas para listas enlazadas

    /**
	* Agrega un elemento al final de la lista.
	* @param elem el elemento a agregar
	* @return {@code true} sii el elemento pudo ser agregado
	*/
    public boolean agregar(T elem){
        
        if(cabeza == null){
            Nodo<T> newNode = new Nodo<> ();
            newNode.setElem(elem);
            newNode.setNext(null);
            cabeza = newNode;
            cantElemts = 1;
            return true;

        }else{
            Nodo<T> aux = new Nodo<T>();
            aux.cabeza = cabeza; 

            for(i = 1, i < cantElemts, i++){
                aux = aux.next; 
            }

            Nodo<T> newNode = new Nodo<> ();
            newNode.setElem(elem);
            newNode.setNext(null);
            aux.setNext(newNode);
            cantElemts++;
            return true;

        }

    }

    /**
	* Agrega todos los elementos de otra lista, al final de esta lista.
	* @param otraLista lista conteniendo todos los elementos a agregar al final de esta lista
	* @return {@code true} sii todos los elementos en {@code otraLista} fueron agregados
	*/
	public boolean agregarTodos(Lista<T> otraLista){
        
        if(cabeza == null){
            cabeza = otraLista.cabeza;
        }else{
            Nodo<T> aux = new Nodo<T>;
            aux.cabeza = cabeza; 
            
            for(i = 1, i < cantElemts, i++){
                aux = aux.next; 
            }

            aux.next = otraLista.cabeza;
            cantElemts = cantElemts + (otraLista.cantElemts);
            return true;

        }
    }

    /**
	* Agrega un elemento en una posicion particular de la lista.
	* @param elem el elemento a agregar
	* @param indice el indice donde se agrega el elemento
	* @return {@code true} sii el elemento pudo ser agregado
	* @throws IndexOutOfBoundsException si {@code indice} &lt; {@code 0}
	*/
	public static boolean insertar(T elem, int indice) throws IndexOutOfBoundsException{
        if(indice > cantElemts || indice < cantElemts){
            throw new IndexOutOfBoundsException("Insertar: invalid index");
        }else{
            Nodo<T> aux = new Nodo<T>;
            aux = cabeza; 

            for(i = 0, i < (indice-1), i++){
                aux = aux.next; 
            }

            Nodo<T> newNode = new Nodo<> ();
            newNode.setElem(elem);
            newNode.setNext(aux.next); //??? Parámetro correcto
            aux.next = newNode;

            return true;
        }
    }

    /**
	* Elimina un elemento de esta lista en una posición particular.
	* @param indice el indice el elemento a eliminar
	* @return el elemento eliminado
	* @throws IndexOutOfBoundsException si ({@code indice} &lt; {@code 0} || {@code indice} &ge; {@code #elementos()})
	* @see #elementos() 
	*/
	public static T eliminar(int indice) throws IndexOutOfBoundsException{
        if(indice > cantElemts || indice < cantElemts)
            throw new IndexOutOfBoundsException("Insertar: invalid index");
        else{
            Nodo<T> aux = new Nodo<T>;
            aux = cabeza; 

            for(i = 0, i < (indice-1), i++){
                aux = aux.next; 
            }

            Nodo<T> auxDel = new Nodo<T>;
            auxDel = aux.next;
            aux.next = auxDel.next;
            auxDel = aux; //¿Con esto ya se eliminaría el elemento deseado?

        }
    }

    /**
	* Obtiene un elemento de esta lista en una posición particular.
	* @param indice el indice el elemento a obtener
	* @return el elemento en la posición {@code indice}
	* @throws IndexOutOfBoundsException si ({@code indice} &lt; {@code 0} || {@code indice} &ge; {@code #elementos()})
	* @see #elementos() 
	*/
	public static T obtener(int indice) throws IndexOutOfBoundsException{
        if(indice > cantElemts || indice < cantElemts)
            throw new IndexOutOfBoundsException("Insertar: invalid index");
        else{
            Nodo<T> aux = new Nodo<T>;
            aux = cabeza; 

            for(i = 0, i < indice, i++){
                aux = aux.next; 
            }

            return aux.elem;
        }
    }

    /**
	* Retorna la porción de esta lista entre los índice especificados {@code desdeInd}, inclusivo, y {@code hastaInd}, exclusivo, en una nueva lista.
	* Si {@code fromInd} es igual a {@code hastaInd} se retorna un a lista vacía.
	* @param desdeInd el índice inferior, inclusivo
	* @param hastaInd el índice superior, exclusivo
	* @return una nueva lista formada con los elementos entre {@code desdeInd} hasta {@code hastaInd - 1} de esta lista
	* @throws IndexOutOfBoundsException si ({@code fromInd} &lt; {@code 0} || {@code hastaInd} &gt; {@code #elementos()} || {@code desdeInd} &gt; {@code hastaInd})
	* @see #elementos() 
	*/
	public Lista<T> subLista(int desdeInd, int hastaInd) throws IndexOutOfBoundsException{
        if (desdeInd>hastaInd || (desdeInd > cantElemts || desdeInd < cantElemts) || (hastaInd > cantElemts || hastaInd< cantElemts))
            throw new IndexOutOfBoundsException("Insertar: invalid index");
        else{
            Nodo<T> aux = new Nodo<T>;
            aux = cabeza; 

            //Me paro sobre el desdeInd
            for(i = 0, i < desdeInd, i++){
                aux = aux.next; 
            }
            
            //hastaInd igual a desdeInd
            if(desdeInd == hastaInd)
                aux.outElem();
            //desdeInd menor a hastaInd
            if(desdeInd < hastaInd)
                int cont;

                for(cont=desdeInd, cont < hastaInd, cont++){
                    aux.outElem();
                    aux = aux.next;
                }
        }


        
    }

    /**
	* Evalua si esta lista contiene un elemento particular, utilizando el método {@code equals(Object)}.
	* @param elem el elemento a buscar
	* @return {@code true} sii, existe un elemento {@code e} en la lista, tal que {@code e == null && elem == null || e.equals(elem)}
	*/
	public boolean contiene(T elem){
        
    }

}
