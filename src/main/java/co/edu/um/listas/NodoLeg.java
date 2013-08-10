package co.edu.um.listas;

/**
 * Created with IntelliJ IDEA.
 * User: OSCAR
 * Date: 10/08/13
 * Time: 02:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class NodoLeg<E> {
    public   NodoLeg<E> siguiente;
    E dato;



    NodoLeg(E dato){

        this(dato,null);
    }
    NodoLeg(E dato,NodoLeg<E> siguiente){
        this.dato = dato;
        this.siguiente = siguiente;


    }
}
