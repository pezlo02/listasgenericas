package co.edu.um.listas;

/**
 * Created with IntelliJ IDEA.
 * User: OSCAR
 * Date: 10/08/13
 * Time: 03:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class LegTest {
    public static  void  main (String args []){
        Leg<Integer> l= new Leg<Integer>();
        l.insertar(new Integer(9));
        l.insertar(new Integer(12));
        System.out.println("Lista de integer actual :\n"+l.toString());
        System.out.print("borrando de la lista 10:");
        if (!l.eliminar(new Integer(10)))
            System.out.println("elemento inexistente");


    }
}
