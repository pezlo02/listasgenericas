package co.edu.um.listas;

/**
 * Created with IntelliJ IDEA.
 * User: OSCAR
 * Date: 10/08/13
 * Time: 02:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class Leg<E> {
    protected NodoLeg<E> primero;protected  int talla;
    public NodoLeg<E> siguiente;

    public Leg(){
        primero=null;
        talla=0;

    }



    public void insertar (E x){
        NodoLeg<E> nuevo =new NodoLeg<E>(x);
        nuevo.siguiente = primero;
        primero = nuevo;this.talla++;


    }

        public void insertarEnFin(E x){
            NodoLeg<E> nl =new NodoLeg<E>(x);this.talla++;
            NodoLeg<E> aux =primero;
            if(aux==null)primero = nl;
            else{
                while (aux.siguiente !=null) aux =aux.siguiente;
// aux referencia al ultimo nodo de la lista
                aux.siguiente =nl;
            }
        }


    public boolean eliminar(E x) {
        boolean False = false;
            NodoLeg<E> aux = primero,ant=null;

        boolean res = False;
            while( aux !=null&&!aux.dato.equals(x)){
                ant=aux;aux=aux.siguiente;
            }

            if (aux!= null){
                res =true;
                int talla1 = this.talla;

                if(ant==null) primero =aux.siguiente;
                else ant.siguiente= aux.siguiente;
            }

            return res;
    }
}
