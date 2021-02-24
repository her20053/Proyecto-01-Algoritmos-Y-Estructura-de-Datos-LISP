import java.util.Vector;

interface Stack<E> {
   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   public int size();
   // post: returns the number of elements in the stack
}


public class Arreglo<E> implements Stack<E> {
    // Al ser un almacenamiento lineal 'o(n)' los datos son almacenados como vector(Implementando metodos de la clase List). 
    private Vector<E> itemsAcumulados = new Vector<>();

    @Override
    /**
     * Encargado de almacenar en el Vector el dato que se pasa como parametro
     */
    public void push(E item) {
        itemsAcumulados.add(item);
    }
    @Override
    /**
     * Encargado de eliminar el dato mas actualizado de la lista y posteriormente retornarlo
     */
    public E pop() {
        E objetoTemp = itemsAcumulados.get(itemsAcumulados.size() - 1);
        itemsAcumulados.remove(itemsAcumulados.size() - 1);
        return objetoTemp;
    }
    @Override
    /**
     * Devuelve el ultimo numero agregado al Vector.
     */
    public E peek() {
        return itemsAcumulados.get(itemsAcumulados.size() - 1);
    }
    @Override
    /**
     * Retorna si el Vector esta vacio - true / tiene datos - false
     */
    public boolean empty() {
        return itemsAcumulados.isEmpty();
    }
    @Override
    /**
     * Retorna el Size del Vector
     */
    public int size() {
        return itemsAcumulados.size();
    }
    
}
