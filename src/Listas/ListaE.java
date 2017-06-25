package Listas;

import Model.Jugador;
import Nodos.NodoE;

public class ListaE {

    private Nodos.NodoE cabeza;
    private Nodos.NodoE ultimo;
    private int size;

    public ListaE() {

        this.size = 0;
        this.cabeza = null;
    }

    private boolean isEmpty() {
        return cabeza == null;
    }

    public boolean addEspaña(Model.Jugador dato, Model.Jugador marca) {

        NodoE nuevo = new NodoE(dato, marca);

        if (size < 11) {
            if (isEmpty()) {
                cabeza = nuevo;

            } else {
                NodoE aux = cabeza;
                int cont = 0;

                while (cont < size - 1) {
                    aux = aux.getSig();
                    cont++;
                }

                if (dato.getPosicion() == "Portero") {
                    Model.Jugador jugadorNulo = new Jugador("", 0, "", "");
                    nuevo.setMarca(jugadorNulo);
                }
                aux.setSig(nuevo);
                ultimo = nuevo;

            }

        } else {
            throw new Error("\"No se puede tener mas de 11 jugadores en la cancha"
                    + " intente realizar un cambio con la opcion Cambiar jugador");

        }

        size++;
        return true;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();

        NodoE aux = cabeza;
        int cont = 0;

        while (cont < size) {
            builder.append(" ");
            builder.append(aux.getDato().getNombre());
            builder.append(" ");
            builder.append(aux.getDato().getEdad());
            builder.append(" ");
            builder.append(aux.getDato().getPosicion());
            builder.append(" ");
            builder.append(aux.getDato().getPais());
            builder.append(" ");
            builder.append(aux.getMarca().getNombre());
            builder.append(" ");
            builder.append(System.getProperty("line.separator"));

            ++cont;
            aux = aux.getSig();
        }

        return builder.toString();
    }

    public NodoE getCabeza() {
        return cabeza;
    }

    public void setCabeza(NodoE cabeza) {
        this.cabeza = cabeza;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
